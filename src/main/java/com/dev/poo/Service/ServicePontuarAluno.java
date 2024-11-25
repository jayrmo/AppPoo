package com.dev.poo.Service;

import com.dev.poo.Aux.Nivel;
import com.dev.poo.Entities.Aluno;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryUsuario;

public class ServicePontuarAluno {
    RepositoryUsuario repositoryUsuario = new RepositoryUsuario(Usuario.class);

    public void calcularPonto(Integer nota, Aluno aluno) {
        System.out.println(aluno.getPontuacao_total());
        aluno.setPontuacao_total(nota);
        System.out.println(aluno.getPontuacao_total());
        System.out.println(aluno.getNivel());
        calcularNivel(aluno.getPontuacao_total(), aluno);
        System.out.println(aluno.getNivel());

        repositoryUsuario.salvar(aluno);


    }

    private Nivel calcularNivel(Integer totalPontuacao, Aluno aluno) {

        if (totalPontuacao > 0 && totalPontuacao < 10) {
            aluno.setNivel(Nivel.CONHECIMENTO);
            return aluno.getNivel();
        } else if (totalPontuacao > 10 && totalPontuacao < 30) {
            aluno.setNivel(Nivel.SINTESE);
            return aluno.getNivel();
        } else if (totalPontuacao > 30 && totalPontuacao < 50) {
            aluno.setNivel(Nivel.COMPREENSAO);
            return aluno.getNivel();
        } else if (totalPontuacao > 50 && totalPontuacao < 70) {
            aluno.setNivel(Nivel.ANALISE);
            return aluno.getNivel();
        } else if (totalPontuacao > 70 && totalPontuacao < 90) {
            aluno.setNivel(Nivel.AVALIACAO);
            return aluno.getNivel();
        } else if (totalPontuacao > 90 && totalPontuacao < 120) {
            aluno.setNivel(Nivel.APLICACAO);
            return aluno.getNivel();
        }
        return null;
    }

}

