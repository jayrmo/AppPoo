package com.dev.poo.Service;

import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Professor;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryProfessor;
import com.dev.poo.Repository.RepositoryUsuario;

public class ControleDeAcesso {
    RepositoryUsuario repositoryUsuario = new RepositoryUsuario(Usuario.class);
    RepositoryProfessor repositoryProfessor = new RepositoryProfessor(Professor.class);

    public Professor autenticar(Professor usuarioLogado) {
        Professor userDB = repositoryProfessor.buscaUnicaPorCampo("email", usuarioLogado.getEmail());
        if (!userDB.getTipo().equals(TipoUsuario.PROFESSOR)) {
            throw new RuntimeException("Permissão negada, apenas professores são permitidos fazer essa operação!");
        }
        return userDB;
    }
}
