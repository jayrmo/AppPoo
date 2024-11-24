package com.dev.poo.EstruturaAbstrata;

import jakarta.persistence.*;
import org.hibernate.exception.ConstraintViolationException;

import java.util.List;

public class DAO<Tipo, ID> implements OperacoesCRUD<Tipo, ID> {


    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbJardim");
    protected EntityManager gerenciaEntidade;
    private Class<Tipo> tipoEntidade;


    public DAO(Class<Tipo> tipoEntidade) {
        this.tipoEntidade = tipoEntidade;
        this.gerenciaEntidade = emf.createEntityManager();
    }

    @Override
    public Tipo salvar(Tipo entidade) {
        EntityTransaction transacao = gerenciaEntidade.getTransaction();
        try {
            transacao.begin();
            gerenciaEntidade.persist(entidade);
            transacao.commit();
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
        return gerenciaEntidade.find(tipoEntidade, id);
    }

    @Override
    public List<Tipo> buscarPorCampo(String nomeCampo, Object valorCampo) {
        try {
            String jpql = "SELECT e FROM " + this.tipoEntidade.getSimpleName() + " e WHERE e." + nomeCampo + " = :valor";
            List<Tipo> entidadesEncontradas = gerenciaEntidade.createQuery(jpql, this.tipoEntidade).setParameter("valor", valorCampo).getResultList();
            return entidadesEncontradas;
        } catch (NoResultException e) {
            e.printStackTrace();
            System.err.println("Dados não encontrados no DB!");
            return null;
        }
    }

    @Override
    public Tipo buscarUnicaPorCampo(String nomeCampo, Object valorCampo) {
        try {
            String jpql = "SELECT e FROM " + this.tipoEntidade.getSimpleName() + " e WHERE e." + nomeCampo + " = :valor";
            Tipo entidadeEncontrada = gerenciaEntidade.createQuery(jpql, this.tipoEntidade).setParameter("valor", valorCampo).getSingleResult();
            return entidadeEncontrada;
        } catch (NoResultException e) {
            e.printStackTrace();
            System.err.println("Dados não encontrados no DB!");
            return null;
        }
    }


    @Override
    public List<Tipo> buscarTodos() {
        String jpql = "SELECT e FROM " + tipoEntidade.getSimpleName() + " e";
        return gerenciaEntidade.createQuery(jpql, tipoEntidade).getResultList();
    }

    @Override
    public void atualizar(Tipo entidade) {
        EntityTransaction transacao = gerenciaEntidade.getTransaction();
        try {
            transacao.begin();
            gerenciaEntidade.merge(entidade);
            System.out.println(entidade);
            transacao.commit();
    } catch(
    RuntimeException e)

    {
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
        System.err.println("Id não encontrado para deletar!");
        throw e;
    }

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
public void fecharConexao() {
    if (gerenciaEntidade.isOpen()) {
        gerenciaEntidade.close();
        System.out.println("Conexão Finalizada!");
    }
}
}
