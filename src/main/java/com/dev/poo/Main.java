package com.dev.poo;


import com.dev.poo.Aux.Categoria;
import com.dev.poo.Aux.ENivel;
import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.*;
import com.dev.poo.Repository.*;
import com.dev.poo.Service.ControleDeAcesso;
import com.dev.poo.Service.ServiceDesafio;
import com.dev.poo.Service.ServicePontuarAluno;
import com.dev.poo.Service.ServiceResposta;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        RepositoryUsuario ru = new RepositoryUsuario(Usuario.class);
        RepositoryAluno ra = new RepositoryAluno(Aluno.class);
        RepositoryProfessor rp = new RepositoryProfessor(Professor.class);
        RepositoryDesafio rd = new RepositoryDesafio(Desafio.class);
        RepositoryResposta rr = new RepositoryResposta(Respostas.class);
        RepositoryClassificacao rc = new RepositoryClassificacao(Classificacao.class);
        ServicePontuarAluno sp = new ServicePontuarAluno();

        ControleDeAcesso login = new ControleDeAcesso();
//        System.out.println(login.autenticarUsuario("jayr.jm7@gmail.com", "123").getNome());


        Classificacao cc1 = new Classificacao();
        Classificacao cc2 = new Classificacao();
        Classificacao cc3 = new Classificacao();
        Classificacao cc4 = new Classificacao();
        Classificacao cc5 = new Classificacao();
        Classificacao cc6 = new Classificacao();
        cc1.setNivel(ENivel.CONHECIMENTO);
        cc1.setPontuacaoMinima(10);
        cc2.setNivel(ENivel.SINTESE);
        cc2.setPontuacaoMinima(20);
        cc3.setNivel(ENivel.COMPREENSAO);
        cc3.setPontuacaoMinima(30);
        cc4.setNivel(ENivel.ANALISE);
        cc4.setPontuacaoMinima(50);
        cc5.setNivel(ENivel.AVALIACAO);
        cc5.setPontuacaoMinima(70);
        cc6.setNivel(ENivel.APLICACAO);
        cc6.setPontuacaoMinima(90);

        List<Classificacao> niveis = new ArrayList<>();
        niveis.add(cc1);
        niveis.add(cc2);
        niveis.add(cc3);
        niveis.add(cc4);
        niveis.add(cc5);
        niveis.add(cc6);

//        for (Classificacao c : niveis){
//            rc.salvar(c);
//        }


        Aluno u1 = new Aluno();
        Aluno u2 = new Aluno();
        Professor u3 = new Professor();
        Aluno u4 = new Aluno();
        Professor u5 = new Professor();

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
        u4.setTipo(TipoUsuario.ALUNO);

        u5.setNome("Sormany");
        u5.setEmail("sormany.ads@gmail.com");
        u5.setSenha("123");
        u5.setTipo(TipoUsuario.PROFESSOR);

//        ru.salvar(u1);
//        ru.salvar(u2);
//        ru.salvar(u3);
//        ru.salvar(u4);
//        ru.salvar(u5);


//        for (Usuario u : ru.buscarTodos()) {
//            System.out.println("Nome: " + u.getNome() + " Tipo: " + u.getTipo());
//        }


//----------------------------- Desafios ---------------------------------------
        ServiceDesafio sv = new ServiceDesafio();
//        Desafio d1 = new Desafio("Soma de dois", "Qual o resultado da soma 5+5", Categoria.MATEMATICA, 5, ENivel.CONHECIMENTO);
//        Desafio d2 = new Desafio("Multiplicação de dois", "Qual o resultado da multiplicação de 5*5", Categoria.MATEMATICA, 10, ENivel.CONHECIMENTO);
//        Desafio d3 = new Desafio("Java", "Qual comando para imprimir no console", Categoria.PROGRAMACAO, 5, ENivel.ANALISE);
//        Desafio d4 = new Desafio("Python", "Qual comando para imprimir no console", Categoria.PROGRAMACAO, 5, ENivel.ANALISE);


//-----------------Salvar desafio-------------------
//        sv.cadastrarDesafio(d1, u5);
//       sv.cadastrarDesafio(d2, u3);
//        sv.cadastrarDesafio(d3, u3);
//        sv.cadastrarDesafio(d4, u5);
//        for (Desafio d : sv.buscarTodos()) {
//            System.out.println("Lista todos: " + d.getId() + " = " + d.getTitulo() + " : " + d.getCategoria());
//        }


//-----------------Deletar desafio-------------------
//        rd.deletarPorId(2L);
//        sv.deletarDesafio(6L, u5);
//
        for (Desafio d : sv.buscarPorCampo("categoria", Categoria.PROGRAMACAO)) {
            System.out.println("Lista Por campo: " + d.getId() + " = " + d.getTitulo() + " : " + d.getCategoria());
        }
//        System.out.println("Por ID 3: " + rd.buscarPorId(2L).getTitulo() + " : " + rd.buscarPorId(3L).getProfessor().getNome());


//-----------------Adicionar Aluno em  desafio-------------------
//        sv.adicionarAlunoDesafio(u2, d1);
//        sv.adicionarAlunoDesafio(u4, d1);
//        sv.adicionarAlunoDesafio(u1, d1);
//        sv.removerAlunoDesafio(u1, d1);
//        sv.removerAlunoDesafio(u1, d1);
//        sv.buscarRelacaoAlunoDesafio(u1, d2);



//----------------------------- Respostas ---------------------------------------
        ServiceResposta sr = new ServiceResposta();
//        Respostas r1 = new Respostas("A resposta para a soma é 55", d1, u1);
//        Respostas r5 = new Respostas("A resposta para a soma é 52", d1, u1);
//        Respostas r6 = new Respostas("A resposta para a soma é 51", d1, u4);
//        Respostas r2 = new Respostas("A resposta para multiplicação é 25", d2, u1);
//        Respostas r3 = new Respostas("O comando é system.out.println()", d3, u4);
//        Respostas r4 = new Respostas("O comando python é print()", d4, u2);
//


//---------------Salvar Respostas---------------
//        sr.salvarResposta(r5);
//        sr.salvarResposta(r1);
//        sr.salvarResposta(r3);
//        sr.salvarResposta(r4);

//        for(Respostas r : sr.buscarTodasRespostas(u5)){
//            System.out.println("________ Resposta _________");
//            System.out.println("Desafio: " + r.getDesafio().getTitulo());
//            System.out.println("Resposta: " + r.getResposta());
//            System.out.println("Aluno: " + r.getAluno().getNome());
//        }

//        for (Respostas r : sr.buscarPorAluno(u1)) {
//            System.out.println(r.getResposta());
//            System.out.println(r.getDesafio().getTitulo());
//            System.out.println(r.getAluno().getEmail());
//        }

//        for (Respostas r : sr.buscarPorDesafio(d1)) {
//            System.out.println(sr.buscarPorAlunoDesafio(r.getAluno(), r.getDesafio()));
//            System.out.println(r.getAluno().getNome());
//            System.out.println(r.getResposta());
//        }
//        }
//        sr.avaliarResposta(5,r1,u5);


//            sp.zerarPontuacao(u1);
//        sr.avaliarResposta(14,r2,u5);
//        sr.avaliarResposta(85,r1,u5);
//        sr.avaliarResposta(63,r3,u5);
//        sr.avaliarResposta(20,r4,u5);
//        for (Classificacao c : rc.buscarTodos()){
//            System.out.println("Nivel: "+c.getNivel());
//            for (Aluno a:c.getAlunos()){
//                System.out.println("→ "+a.getNome());
//            }
//        }



    }
}