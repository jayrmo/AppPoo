package com.dev.poo.Service;

import com.dev.poo.Entities.*;
import com.dev.poo.Repository.RepositoryAluno;
import com.dev.poo.Repository.RepositoryDesafio;

import java.util.List;

public class ServiceDesafio {
    RepositoryAluno repositoryAluno = new RepositoryAluno(Aluno.class);
    RepositoryDesafio repositoryDesafio = new RepositoryDesafio(Desafio.class);
    ControleDeAcesso autenticar = new ControleDeAcesso();


    public Desafio cadastrarDesafio(Desafio desafio, Professor usuarioLogado) {
        Professor userDB = autenticar.autenticarProfessor(usuarioLogado);
        desafio.setProfessor(userDB);
        repositoryDesafio.salvar(desafio);
        return desafio;
    }

    public void adicionarAlunoDesafio(Aluno aluno, Desafio desafio) {
        Aluno alunoDB = repositoryAluno.buscaUnicaPorCampo("email", aluno.getEmail());
        Desafio desafioDB = repositoryDesafio.buscaUnicaPorCampo("titulo", desafio.getTitulo());
        for (Aluno a : desafioDB.getAlunos()) {
            if (a.getEmail().equals(alunoDB.getEmail())) {
                System.out.println("Aluno já vinculado com esse desafio!");
                return;
            }
        }
        desafioDB.getAlunos().add(alunoDB);
        repositoryDesafio.atualizar(desafioDB);
        System.out.println("Adicionado Lista de aluno");

    }

    public void removerAlunoDesafio(Aluno aluno, Desafio desafio) {
        Aluno alunoDB = repositoryAluno.buscaUnicaPorCampo("email", aluno.getEmail());
        Desafio desafioDB = repositoryDesafio.buscaUnicaPorCampo("titulo", desafio.getTitulo());
        if (!desafioDB.getAlunos().isEmpty()) {
            for (Aluno a : desafioDB.getAlunos()) {
                if (a.getEmail().equals(alunoDB.getEmail())) {
                    desafioDB.getAlunos().remove(a);
                    repositoryDesafio.atualizar(desafioDB);
                    System.out.println("Desafio " + desafioDB.getTitulo() + " removido de " + alunoDB.getNome());
                    return;
                }
            }
            System.out.println("Não existe vinculo entre " + aluno.getNome() + " e " + desafio.getTitulo());
            return;
        }
        System.out.println("Nenhum Aluno vinculado ao desafio: " + desafio.getTitulo());

    }

    public boolean buscarRelacaoAlunoDesafio(Aluno aluno, Desafio desafio) {
        Aluno alunoDB = repositoryAluno.buscaUnicaPorCampo("email", aluno.getEmail());
        Desafio desafioDB = repositoryDesafio.buscaUnicaPorCampo("titulo", desafio.getTitulo());
        for (Aluno a : desafioDB.getAlunos()) {
            if (a.getEmail().equals(alunoDB.getEmail())) {
                System.out.println("Relação encontrada!");
                return true;
            }
        }
        System.out.println("Não existe relação entre esse Aluno e Desafio!");
        return false;

    }

    public List<Desafio> buscarTodos() {
        return repositoryDesafio.buscarTodos();
    }

    public List<Desafio> buscarPorCampo(String nomeCampo, Object valorCampo) {
        return repositoryDesafio.buscarPorCampo(nomeCampo, valorCampo);
    }

    public void deletarDesafio(Long id, Professor usuarioLogado) {
        autenticar.autenticarProfessor(usuarioLogado);
        repositoryDesafio.deletarPorId(id);
    }

    public void responderDesafio(Respostas resposta) {

    }
}
