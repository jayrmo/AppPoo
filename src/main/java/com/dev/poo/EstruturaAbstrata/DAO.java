package com.dev.poo.EstruturaAbstrata;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class DAO<Tipo, ID> implements OperacoesCRUD<Tipo, ID> {

    @PersistenceContext
    protected EntityManager gerenciaEntidade;

    private Class<Tipo> tipoEntidade;

    public DAO(Class<Tipo> tipoEntidade) {
        this.tipoEntidade = tipoEntidade;
    }

    @Override
    public void salvar(Tipo entidade) {
        EntityTransaction transacao = gerenciaEntidade.getTransaction();
        try {
            transacao.begin();
            gerenciaEntidade.persist(entidade);
            transacao.commit();
        } catch (RuntimeException e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            throw e;
        }


    }

    @Override
    public Tipo buscarPorId(ID id) {
        return gerenciaEntidade.find(tipoEntidade, id);
    }

    @Override
    public List<Tipo> buscarTodos() {
        String jpql = "SELECT e FROM " + tipoEntidade.getSimpleName() + " e";
        return gerenciaEntidade.createQuery(jpql, tipoEntidade).getResultList();
    }

    @Override
    public void deletar(Tipo entidade) {
        EntityTransaction transacao = gerenciaEntidade.getTransaction();
        try {
            transacao.begin();
            if (gerenciaEntidade.contains(entidade)) {
                gerenciaEntidade.remove(entidade);
            } else {
                gerenciaEntidade.remove(gerenciaEntidade.merge(entidade));
            }
            transacao.commit();
        } catch (RuntimeException e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            throw e;
        }
    }

    @Override
    public void deletarPorId(ID id) {
        EntityTransaction transacao = gerenciaEntidade.getTransaction();
        try {
            transacao.begin();
            Tipo entidade = buscarPorId(id);

            if (entidade != null) {
                gerenciaEntidade.remove(entidade);
            }
            transacao.commit();
        } catch (RuntimeException e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            throw e;
        }

    }

    @Override
    public void atualizar(Tipo entidade) {
        EntityTransaction transacao = gerenciaEntidade.getTransaction();
        try {
            transacao.begin();
            if (gerenciaEntidade.contains(entidade)) {
                gerenciaEntidade.merge(entidade);
            }
            transacao.commit();
        } catch (RuntimeException e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            throw e;
        }
    }
}
