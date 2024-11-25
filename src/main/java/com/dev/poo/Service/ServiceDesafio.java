package com.dev.poo.Service;

import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Desafio;
import com.dev.poo.Entities.Professor;
import com.dev.poo.Entities.Respostas;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryDesafio;
import com.dev.poo.Repository.RepositoryUsuario;

import java.util.List;

public class ServiceDesafio {
    RepositoryUsuario repositoryUsuario = new RepositoryUsuario(Usuario.class);
    RepositoryDesafio repositoryDesafio = new RepositoryDesafio(Desafio.class);
    ControleDeAcesso autenticar = new ControleDeAcesso();

    public void cadastrarDesafio(Desafio desafio, Professor usuarioLogado) {
        Professor userDB = autenticar.autenticar(usuarioLogado);
//        System.out.println(userDB.getEmail());
        desafio.setProfessor(userDB);
        repositoryDesafio.salvar(desafio);
    }

    public List<Desafio> buscarTodos() {
        return repositoryDesafio.buscarTodos();
    }

    public List<Desafio> buscarPorCampo(String nomeCampo, Object valorCampo){
        return repositoryDesafio.buscarPorCampo(nomeCampo, valorCampo);
    }

    public void deletarDesafio(Long id, Professor usuarioLogado) {
        autenticar.autenticar(usuarioLogado);
        repositoryDesafio.deletarPorId(id);
    }

    public void responderDesafio(Respostas resposta){

    }
}
