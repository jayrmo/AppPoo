package com.dev.poo.Service;

import com.dev.poo.Aux.ENivel;
import com.dev.poo.Entities.Aluno;
import com.dev.poo.Entities.Classificacao;
import com.dev.poo.Entities.Respostas;
import com.dev.poo.Repository.RepositoryAluno;
import com.dev.poo.Repository.RepositoryClassificacao;

public class ServicePontuarAluno {
    RepositoryAluno repositoryAluno = new RepositoryAluno(Aluno.class);
    RepositoryClassificacao rc = new RepositoryClassificacao(Classificacao.class);

    protected void pontuarAluno(Integer notaAntiga, Respostas resposta) {
        System.out.println(notaAntiga);
        System.out.println(resposta.getAvaliacao());
        Aluno a = repositoryAluno.buscaUnicaPorCampo("email", resposta.getAluno().getEmail());
        if (a.getPontosAcumulados() == null) {
            a.setPontosAcumulados(resposta.getAvaliacao());
            repositoryAluno.atualizar(a);
            calcularClassificacao(a);
            System.out.println("Novos Pontos acumulados");

        } else {
            if (notaAntiga < resposta.getAvaliacao()) {
                Integer diferenca = resposta.getAvaliacao() - notaAntiga;
                a.setPontosAcumulados(a.getPontosAcumulados() + diferenca);
                repositoryAluno.atualizar(a);
                calcularClassificacao(resposta.getAluno());
                System.out.println("Somado " + diferenca + " nos pontos de " + resposta.getAluno().getNome());
            } else if (notaAntiga > resposta.getAvaliacao()) {
                Integer diferenca = notaAntiga - resposta.getAvaliacao();
                a.setPontosAcumulados(a.getPontosAcumulados() - diferenca);
                repositoryAluno.atualizar(a);
                calcularClassificacao(resposta.getAluno());
                System.out.println("Diminuido " + diferenca + " nos pontos de " + resposta.getAluno().getNome());
            } else {
                System.out.println("Não houve mudança na pontuação de " + resposta.getAluno().getNome());
                calcularClassificacao(a);
            }
        }
    }

    public void zerarPontuacao(Aluno aluno) {
        Aluno a = repositoryAluno.buscaUnicaPorCampo("email", aluno.getEmail());
        a.setPontosAcumulados(null);
        a.setClassificacao(null);
        repositoryAluno.atualizar(a);
    }

    protected Classificacao calcularClassificacao(Aluno alunoAvaliado) {
        Aluno aluno = repositoryAluno.buscaUnicaPorCampo("email", alunoAvaliado.getEmail());
        Integer pontosAcumulados = aluno.getPontosAcumulados();
        if (aluno.getPontosAcumulados() >= 10 && pontosAcumulados < 20) {
            aluno.setClassificacao(rc.buscaUnicaPorCampo("nivel", ENivel.CONHECIMENTO));
            repositoryAluno.atualizar(aluno);
            repositoryAluno.fecharConexao();
            System.out.println("Nivel " + aluno.getClassificacao().getNivel() + " aplicado! para " + aluno.getNome());
            return aluno.getClassificacao();
        } else if (aluno.getPontosAcumulados() >= 20 && pontosAcumulados < 30) {
            aluno.setClassificacao(rc.buscaUnicaPorCampo("nivel", ENivel.SINTESE));
            repositoryAluno.atualizar(aluno);
            repositoryAluno.fecharConexao();
            System.out.println("Nivel " + aluno.getClassificacao().getNivel() + " aplicado! para " + aluno.getNome());
            return aluno.getClassificacao();
        } else if (pontosAcumulados >= 30 && pontosAcumulados < 50) {
            aluno.setClassificacao(rc.buscaUnicaPorCampo("nivel", ENivel.COMPREENSAO));
            repositoryAluno.atualizar(aluno);
            repositoryAluno.fecharConexao();
            System.out.println("Nivel " + aluno.getClassificacao().getNivel() + " aplicado! para " + aluno.getNome());
            return aluno.getClassificacao();
        } else if (pontosAcumulados >= 50 && pontosAcumulados < 70) {
            aluno.setClassificacao(rc.buscaUnicaPorCampo("nivel", ENivel.ANALISE));
            repositoryAluno.atualizar(aluno);
            repositoryAluno.fecharConexao();
            System.out.println("Nivel " + aluno.getClassificacao().getNivel() + " aplicado! para " + aluno.getNome());
            return aluno.getClassificacao();
        } else if (pontosAcumulados >= 70 && pontosAcumulados < 90) {
            aluno.setClassificacao(rc.buscaUnicaPorCampo("nivel", ENivel.AVALIACAO));
            repositoryAluno.atualizar(aluno);
            repositoryAluno.fecharConexao();
            System.out.println("Nivel " + aluno.getClassificacao().getNivel() + " aplicado! para " + aluno.getNome());
            return aluno.getClassificacao();
        } else if (pontosAcumulados >= 90 && pontosAcumulados < 120) {
            aluno.setClassificacao(rc.buscaUnicaPorCampo("nivel", ENivel.APLICACAO));
            repositoryAluno.atualizar(aluno);
            repositoryAluno.fecharConexao();
            System.out.println("Nivel " + aluno.getClassificacao().getNivel() + " aplicado! para " + aluno.getNome());
            return aluno.getClassificacao();
        }
        System.out.println("Nenhum nivel aplicado para " + aluno.getNome());
        repositoryAluno.fecharConexao();
        return null;
    }
//    public void
//    calcularPonto(Integer nota, Aluno aluno) {
//        System.out.println(aluno.getPontuacao_total());
//        aluno.setPontuacao_total(nota);
//        System.out.println(aluno.getPontuacao_total());
//        System.out.println(aluno.getNivel());
//        calcularNivel(aluno.getPontuacao_total(), aluno);
//        System.out.println(aluno.getNivel());
//
//        repositoryUsuario.salvar(aluno);
//
//
//    }
//
//    private Nivel calcularNivel(Integer totalPontuacao, Aluno aluno) {
//
//        if (totalPontuacao > 0 && totalPontuacao <= 10) {
//            aluno.setNivel(Nivel.CONHECIMENTO);
//            return aluno.getNivel();
//        } else if (totalPontuacao > 10 && totalPontuacao <= 30) {
//            aluno.setNivel(Nivel.SINTESE);
//            return aluno.getNivel();
//        } else if (totalPontuacao > 30 && totalPontuacao <= 50) {
//            aluno.setNivel(Nivel.COMPREENSAO);
//            return aluno.getNivel();
//        } else if (totalPontuacao > 50 && totalPontuacao <= 70) {
//            aluno.setNivel(Nivel.ANALISE);
//            return aluno.getNivel();
//        } else if (totalPontuacao > 70 && totalPontuacao <= 90) {
//            aluno.setNivel(Nivel.AVALIACAO);
//            return aluno.getNivel();
//        } else if (totalPontuacao > 90 && totalPontuacao <= 120) {
//            aluno.setNivel(Nivel.APLICACAO);
//            return aluno.getNivel();
//        }
//        return null;
//    }

}

