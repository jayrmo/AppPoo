package com.dev.poo.EstruturaAbstrata;

import jakarta.persistence.*;
import org.hibernate.exception.ConstraintViolationException;

import java.util.List;

public class DAO<Tipo, ID> implements OperacoesCRUD<Tipo, ID> {


    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbJardim");
    protected EntityManager em;
    private Class<Tipo> tipoEntidade;


    public DAO(Class<Tipo> tipoEntidade) {
        this.tipoEntidade = tipoEntidade;
        this.em = emf.createEntityManager();
    }

    @Override
    public Tipo salvar(Tipo entidade) {
//        System.out.println(entidade);
//        EntityManager em = emf.createEntityManager();
        EntityTransaction transacao = this.em.getTransaction();
//        EntityTransaction transacao = gerenciaEntidade.getTransaction();
        try {
            transacao.begin();
            this.em.persist(entidade);
            transacao.commit();
            System.out.println("Salvo com sucesso!");
            return entidade;
        } catch (PersistenceException erro) {
            if (erro.getCause() instanceof ConstraintViolationException) {
                System.err.println("Erro de restrição no banco de dados (unicidade)");
            }
            if (transacao.isActive()) {
                transacao.rollback();
            }
            return null;
        } catch (RuntimeException e) {
            e.printStackTrace();
            if (transacao.isActive()) {
                transacao.rollback();
            }
            return null;
        }

    }


    @Override
    public Tipo buscarPorId(ID id) {
//        EntityManager em = emf.createEntityManager();
        return this.em.find(tipoEntidade, id);
    }

    @Override
    public List<Tipo> buscarPorCampo(String nomeCampo, Object valorCampo) {
//        EntityManager em = emf.createEntityManager();
        try {
            String jpql = "SELECT e FROM " + this.tipoEntidade.getSimpleName() + " e WHERE e." + nomeCampo + " = :valor";
            List<Tipo> entidadesEncontradas = this.em.createQuery(jpql, this.tipoEntidade).setParameter("valor", valorCampo).getResultList();
            return entidadesEncontradas;
        } catch (NoResultException e) {
            e.printStackTrace();
            System.err.println("Dados não encontrados no DB!");
            return null;
        }
    }

    @Override
    public Tipo buscaUnicaPorCampo(String nomeCampo, Object valorCampo) {
//        EntityManager em = emf.createEntityManager();
        try {
            String jpql = "SELECT e FROM " + this.tipoEntidade.getSimpleName() + " e WHERE e." + nomeCampo + " = :valor";
            Tipo entidadeEncontrada = this.em.createQuery(jpql, this.tipoEntidade).setParameter("valor", valorCampo).getSingleResult();
            return entidadeEncontrada;
        } catch (NoResultException e) {
            e.printStackTrace();
            System.err.println("Dados não encontrados no DB!");
            return null;
        }
    }


    @Override
    public List<Tipo> buscarTodos() {
//        EntityManager em = emf.createEntityManager();
        String jpql = "SELECT e FROM " + tipoEntidade.getSimpleName() + " e";
        return this.em.createQuery(jpql, tipoEntidade).getResultList();
    }

    @Override
    public void atualizar(Tipo entidade) {
//        EntityManager em = emf.createEntityManager();
        EntityTransaction transacao = this.em.getTransaction();
        try {
            transacao.begin();
            this.em.merge(entidade);
            System.out.println(entidade);
            transacao.commit();
        } catch (
                RuntimeException e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            throw e;
        }

    }

    @Override
    public void deletarPorId(ID id) {
//        EntityManager em = emf.createEntityManager();
        EntityTransaction transacao = this.em.getTransaction();
        try {
            transacao.begin();
            Tipo entidade = buscarPorId(id);
            if (entidade != null) {
                this.em.remove(entidade);
            }
            transacao.commit();
        } catch (RuntimeException e) {
            if (transacao.isActive()) {
                transacao.rollback();
            }
            System.err.println("Id não encontrado para deletar!");
            throw e;
        }
    }

    @Override
    public void deletar(Tipo entidade) {
//        EntityManager em = emf.createEntityManager();
        EntityTransaction transacao = this.em.getTransaction();
        try {
            transacao.begin();
            if (this.em.contains(entidade)) {
                this.em.remove(entidade);
            } else {
                this.em.remove(this.em.merge(entidade));
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
    public void fecharConexao() {
//        EntityManager em = emf.createEntityManager();
        if (this.em.isOpen()) {
            this.em.close();
            System.out.println("Conexão Finalizada!");
        }
    }
}
