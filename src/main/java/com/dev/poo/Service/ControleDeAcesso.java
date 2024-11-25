package com.dev.poo.Service;

import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryUsuario;

public class ControleDeAcesso {
    RepositoryUsuario repositoryUsuario = new RepositoryUsuario(Usuario.class);

    public void autenticar(Usuario usuarioLogado){
        Usuario userDB = repositoryUsuario.buscaUnicaPorCampo("email", usuarioLogado.getEmail());
        if (!userDB.getTipo().equals(TipoUsuario.PROFESSOR)) {
            throw new RuntimeException("Permissão negada, apenas professores são permitidos fazer essa operação!");
        }
    }
}
