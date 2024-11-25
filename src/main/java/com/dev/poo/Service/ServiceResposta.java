package com.dev.poo.Service;

import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Aluno;
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
    ControleDeAcesso autenticar = new ControleDeAcesso();

    public void salvarResposta(Respostas resposta) {
        Desafio desafioDB = repositoryDesafio.buscaUnicaPorCampo("titulo", resposta.getDesafio().getTitulo());
        Usuario userDB = repositoryUsuario.buscaUnicaPorCampo("email", resposta.getAluno().getEmail());
        resposta.setDesafio(desafioDB);
        resposta.setAluno(userDB);
        repositoryResposta.salvar(resposta);
    }

//    public void avaliarResposta(Integer nota, Respostas resposta, Usuario usuarioLogado) {
//        Respostas respostaDB = repositoryResposta.buscaUnicaPorCampo("id", resposta.getId());
//        autenticar.autenticar(usuarioLogado);
//        respostaDB.setAvaliacao(nota);
//        repositoryResposta.atualizar(respostaDB);
//
//        Usuario aluno = repositoryUsuario.buscaUnicaPorCampo("email", resposta.getAluno().getEmail());
//        ServicePontuarAluno pontuarAluno = new ServicePontuarAluno();
//        pontuarAluno.calcularPonto(nota, aluno.);
//
////        System.out.println(respostaDB.getAluno().getId());
////        System.out.println(respostaDB.getResposta());
//    }

//    public void atualizarResposta(Respostas resposta, Usuario usuarioLogado){
//        Respostas respostaDB = repositoryResposta.buscaUnicaPorCampo("id", resposta.getId());
//        autenticar.autenticar(usuarioLogado);
//        repositoryResposta.salvar(respostaDB);
//
//
//    }


    public void deletarResposta(Long id, Usuario usuarioLogado){
            autenticar.autenticar(usuarioLogado);
            repositoryResposta.deletarPorId(id);
    }


}
