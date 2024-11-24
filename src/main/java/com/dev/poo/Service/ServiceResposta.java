package com.dev.poo.Service;

import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Desafio;
import com.dev.poo.Entities.Respostas;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryDesafio;
import com.dev.poo.Repository.RepositoryResposta;
import com.dev.poo.Repository.RepositoryUsuario;

public class ServiceResposta {
    RepositoryResposta repositoryResposta = new RepositoryResposta(Respostas.class);
    RepositoryDesafio repositoryDesafio = new RepositoryDesafio(Desafio.class);
    RepositoryUsuario repositoryUsuario = new RepositoryUsuario(Usuario.class);

    public void salvarResposta(Respostas resposta){
        Desafio desafioDB = repositoryDesafio.buscarUnicaPorCampo("titulo", resposta.getDesafio().getTitulo());
        Usuario userDB = repositoryUsuario.buscarUnicaPorCampo("email", resposta.getAluno().getEmail());
        resposta.setDesafio(desafioDB);
        resposta.setAluno(userDB);
        repositoryResposta.salvar(resposta);
    }

    public void avaliarResposta(Respostas resposta, Integer avaliacao, Usuario usuarioLogado){
        Usuario userDB = repositoryUsuario.buscarUnicaPorCampo("email", usuarioLogado.getEmail());
        if (!userDB.getTipo().equals(TipoUsuario.PROFESSOR)) {
            throw new RuntimeException("Apenas Professores podem Avaliar Desafios");
        }
//        resposta.getDesafio().
        resposta.setAvaliacao(avaliacao);
        System.out.println(resposta.getAvaliacao());
        System.out.println(resposta.getDesafio().getTitulo());
        System.out.println(resposta.getAluno().getNome());
//        repositoryResposta.salvar(resposta);

    }
}
