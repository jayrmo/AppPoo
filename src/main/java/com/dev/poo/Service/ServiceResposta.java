package com.dev.poo.Service;

import com.dev.poo.Entities.*;
import com.dev.poo.Repository.RepositoryAluno;
import com.dev.poo.Repository.RepositoryDesafio;
import com.dev.poo.Repository.RepositoryResposta;
import com.dev.poo.Repository.RepositoryUsuario;

import java.util.List;

public class ServiceResposta {
    RepositoryResposta repositoryResposta = new RepositoryResposta(Respostas.class);
    RepositoryDesafio repositoryDesafio = new RepositoryDesafio(Desafio.class);
    RepositoryUsuario repositoryUsuario = new RepositoryUsuario(Usuario.class);
    ControleDeAcesso autenticar = new ControleDeAcesso();

    public void salvarResposta(Respostas resposta) {
        Desafio desafioDB = repositoryDesafio.buscaUnicaPorCampo("titulo", resposta.getDesafio().getTitulo());
        Usuario userDB = repositoryUsuario.buscaUnicaPorCampo("email", resposta.getAluno().getEmail());
        resposta.setDesafio(desafioDB);
        resposta.setAluno((Aluno) userDB);
        repositoryResposta.salvar(resposta);
    }

    public List<Respostas> buscarTodasRespostas(Professor usuarioLogado) {
        autenticar.autenticarProfessor(usuarioLogado);
        return repositoryResposta.buscarTodos();
    }

    public List<Respostas> buscarPorDesafio(Desafio desafio) {
        Desafio desafioDB = repositoryDesafio.buscaUnicaPorCampo("titulo", desafio.getTitulo());
        List<Respostas> respostas = repositoryResposta.buscarPorCampo("desafio", desafioDB);
        return respostas;
    }

    public List<Respostas> buscarPorAluno(Usuario aluno) {
        Usuario alunoDB = repositoryUsuario.buscaUnicaPorCampo("email", aluno.getEmail());
        List<Respostas> respostas = repositoryResposta.buscarPorCampo("aluno", alunoDB);
        return respostas;
    }

    public Respostas buscarPorAlunoDesafio(Aluno aluno, Desafio desafio) {
        Desafio desafioDB = repositoryDesafio.buscaUnicaPorCampo("titulo", desafio.getTitulo());
        Usuario alunoDB = repositoryUsuario.buscaUnicaPorCampo("email", aluno.getEmail());
        for (Respostas d : buscarPorDesafio(desafioDB)) {
            if (d.getAluno().equals(alunoDB)) {
                return d;
            }
        }
        System.out.println("Nenhuma resposta de " + aluno.getNome() + " para " + desafio.getTitulo());
        return null;
    }


    public Professor deletarResposta(Long id, Professor usuarioLogado) {
        autenticar.autenticarProfessor(usuarioLogado);
        repositoryResposta.deletarPorId(id);
        return usuarioLogado;
    }

    public void avaliarResposta(Integer nota, Respostas resposta, Professor usuarioLogado) {
        autenticar.autenticarProfessor(usuarioLogado);
        Respostas r = repositoryResposta.buscarPorAlunoEDesafio(resposta.getAluno().getEmail(),
                resposta.getDesafio().getTitulo());
        ServicePontuarAluno sp = new ServicePontuarAluno();
        if (r.getAvaliacao() == null) {
            r.setAvaliacao(nota);
            repositoryResposta.atualizar(r);
            sp.pontuarAluno(nota, r);
        } else if (r.getAvaliacao() < 0) {
            r.setAvaliacao(0);
            repositoryResposta.atualizar(r);
            System.out.println("é menor");
            return;
        } else {
            Integer notaAntiga = r.getAvaliacao();
            r.setAvaliacao(nota);
            repositoryResposta.atualizar(r);
            sp.pontuarAluno(notaAntiga, r);
        }

        System.out.println(r.getAvaliacao());


    }

}
