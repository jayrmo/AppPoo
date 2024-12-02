package com.dev.poo.Service;

import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Professor;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryProfessor;
import com.dev.poo.Repository.RepositoryUsuario;
import jakarta.persistence.NoResultException;

public class ControleDeAcesso {
    RepositoryUsuario repositoryUsuario = new RepositoryUsuario(Usuario.class);
    RepositoryProfessor repositoryProfessor = new RepositoryProfessor(Professor.class);

    public Professor autenticarProfessor(Professor usuarioLogado) throws NoResultException {
        Professor userDB = repositoryProfessor.buscaUnicaPorCampo("email", usuarioLogado.getEmail());
        if (!userDB.getTipo().equals(TipoUsuario.PROFESSOR)) {
            throw new RuntimeException("Permissão negada, apenas professores são permitidos fazer essa operação!");
        }
        return userDB;
    }

    public Usuario autenticarUsuario(String email, String senha){
        Usuario userDB = repositoryUsuario.buscaUnicaPorCampo("email", email);
        if (userDB != null) {
            if (userDB.getSenha().equals(senha)) {
                return userDB;
            }
            return null;
        }
        return null;

    }
}
