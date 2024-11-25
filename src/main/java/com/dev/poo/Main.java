package com.dev.poo;


import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.*;
import com.dev.poo.Repository.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        RepositoryUsuario ru = new RepositoryUsuario(Usuario.class);
        RepositoryAluno ra = new RepositoryAluno(Aluno.class);
        RepositoryProfessor rp = new RepositoryProfessor(Professor.class);
        Usuario u1 = new Aluno();
        Usuario u2 = new Aluno();
        Usuario u3 = new Professor();
        Usuario u4 = new Aluno();

        u1.setNome("jayr Martins de oliveira");
        u1.setEmail("jayr.jm7@gmail.com");
        u1.setSenha("123");
        u1.setTipo(TipoUsuario.ALUNO);

        u2.setNome("Dimitri");
        u2.setEmail("dimitro.ads@gmail.com");
        u2.setSenha("123");
        u2.setTipo(TipoUsuario.ALUNO);

        u3.setNome("pablo");
        u3.setEmail("pablo.ads@gmail.com");
        u3.setSenha("123");
        u3.setTipo(TipoUsuario.PROFESSOR);

        u4.setNome("Tiago");
        u4.setEmail("tiago.ads@gmail.com");
        u4.setSenha("123");
        u4.setTipo(TipoUsuario.PROFESSOR);



//
//        ServiceDesafio sv = new ServiceDesafio();
//        Desafio d1 = new Desafio("Soma de dois", "Qual o resultado da soma 5+5", Categoria.MATEMATICA, 5, Nivel.CONHECIMENTO);
//        Desafio d2 = new Desafio("Multiplicação de dois", "Qual o resultado da multiplicação de 5*5", Categoria.MATEMATICA, 10, Nivel.CONHECIMENTO);
//        Desafio d3 = new Desafio("Java", "Qual comando para imprimir no console", Categoria.PROGRAMACAO, 5, Nivel.ANALISE);
//        Desafio d4 = new Desafio("Python", "Qual comando para imprimir no console", Categoria.PROGRAMACAO, 5, Nivel.ANALISE);
//        List<Desafio> desafiosParaSalvar = new ArrayList<>();
//        desafiosParaSalvar.add(d1);
//        desafiosParaSalvar.add(d2);
//        desafiosParaSalvar.add(d3);
//        desafiosParaSalvar.add(d4);

//        sv.cadastrarDesafio(d4, u3);
//        for (Desafio d : desafiosParaSalvar){
//            sv.cadastrarDesafio(d, u3);
//        }
//
//        for (Desafio d : sv.buscarPorCampo("categoria", Categoria.PROGRAMACAO)) {
//            System.out.println(d.getId()+" = "+d.getTitulo());
//        }
//////        sv.deletarDesafio(10L, u3);
////////        sv.listarDesafios();
//        ServiceResposta sr = new ServiceResposta();
//        Respostas r1 = new Respostas("A resposta para a soma é 55", d1, u2);
//        r1.setId(6L);
////        sr.atualizarResposta(r1, u3);
////        sr.salvarResposta(r1);
//
//
////        sr.avaliarResposta(8, r1,u3);
////        sr.deletarResposta(5L, u3);

//        repositoryUsuario.fecharConexao();
    }
}