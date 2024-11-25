package com.dev.poo.Repository;

import com.dev.poo.Entities.Usuario;
import com.dev.poo.EstruturaAbstrata.DAO;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

public class RepositoryUsuario extends DAO<Usuario, Long> {
    public RepositoryUsuario(Class<Usuario> tipoEntidade) {
        super(tipoEntidade);
    }

}



