package com.dev.poo.Repository;

import com.dev.poo.Entities.Usuario;
import com.dev.poo.EstruturaAbstrata.DAO;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

public class RepositoryUsuario extends DAO<Usuario, Long> {
    public RepositoryUsuario(Class<Usuario> tipoEntidade) {
        super(tipoEntidade);
    }

//    public Long buscarPorEmail(String email) {
//        String jpql = "SELECT u.id FROM Usuario u where u.email = :email";
//        try {
//            Long id = gerenciaEntidade.createQuery(jpql, Long.class).setParameter("email", email).getSingleResult();
//            return id;
//        } catch (NoResultException erro) {
//            System.out.println("Nenhum usuário encontrato com o email " + email);
//            return null;
//        }
////        buscarPorId(id);
//    }


//    @Override
//    public void salvar(Usuario entidade) {
//        EntityTransaction transacao = gerenciaEntidade.getTransaction();
//
//        try {
//            String jpql = "SELECT COUNT(u) FROM Usuario u WHERE u.email = :email";
//            Long count = gerenciaEntidade.createQuery(jpql, Long.class)
//                    .setParameter("email", entidade.getEmail())
//                    .getSingleResult();
//
////            if (count > 0) {
////                throw new RuntimeException("Já Existe um usuário com esse Email");
////            } else {
//                if (!gerenciaEntidade.contains(entidade)) {
//                    transacao.begin();
//                    gerenciaEntidade.persist(entidade);
//                    transacao.commit();
////                } else {
////                    throw new RuntimeException("Usuário Já existe!");
////                }
//            }
//        } catch (RuntimeException e) {
//            if (transacao.isActive()) {
//                transacao.rollback();
//            }
//            throw e;
//        }
//    }

}



