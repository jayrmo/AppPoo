package com.dev.poo.Service;

import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Desafio;
import com.dev.poo.Entities.Respostas;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryDesafio;
import com.dev.poo.Repository.RepositoryUsuario;

import java.util.List;

public class ServiceDesafio {
    RepositoryUsuario repositoryUsuario = new RepositoryUsuario(Usuario.class);
    RepositoryDesafio repositoryDesafio = new RepositoryDesafio(Desafio.class);

    public void cadastrarDesafio(Desafio desafio, Usuario usuarioLogado) {
        Usuario userDB = repositoryUsuario.buscarUnicaPorCampo("email", usuarioLogado.getEmail());
        if (!userDB.getTipo().equals(TipoUsuario.PROFESSOR)) {
            throw new RuntimeException("Apenas Professores podem Cadastrar Desafios");
        }
        desafio.setProfessor(userDB);
        repositoryDesafio.salvar(desafio);
    }

    public List<Desafio> buscarTodos() {
        return repositoryDesafio.buscarTodos();
    }

    public List<Desafio> buscarPorCampo(String nomeCampo, Object valorCampo){
        return repositoryDesafio.buscarPorCampo(nomeCampo, valorCampo);
    }

    public void deletarDesafio(Long id, Usuario usuarioLogado) {

        if (!usuarioLogado.getTipo().equals(TipoUsuario.PROFESSOR)) {
            throw new RuntimeException("Apenas Professores podem Deletar Desafios");
        }
        repositoryDesafio.deletarPorId(id);
    }

    public void responderDesafio(Respostas resposta){

    }
}
