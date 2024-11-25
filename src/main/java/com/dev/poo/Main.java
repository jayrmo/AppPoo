package com.dev.poo;


import com.dev.poo.Aux.Categoria;
import com.dev.poo.Aux.Nivel;
import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.*;
import com.dev.poo.Repository.*;
import com.dev.poo.Service.ServiceDesafio;
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
        Aluno u1 = new Aluno();
        Usuario u2 = new Aluno();
        Usuario u3 = new Professor();
        Usuario u4 = new Aluno();
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

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);

//----------------Salvar usuarios--------------
// for (Usuario usuario : usuarios) {
//            ru.salvar(usuario);
//        }

        for (Usuario u : ru.buscarTodos()){
            System.out.println("Nome: "+ u.getNome() + " Tipo: "+u.getTipo());
        };
//        ru.salvar(u5);








//----------------------------- Desafios ---------------------------------------

        ServiceDesafio sv = new ServiceDesafio();
        Desafio d1 = new Desafio("Soma de dois", "Qual o resultado da soma 5+5", Categoria.MATEMATICA, 5, Nivel.CONHECIMENTO);
        Desafio d2 = new Desafio("Multiplicação de dois", "Qual o resultado da multiplicação de 5*5", Categoria.MATEMATICA, 10, Nivel.CONHECIMENTO);
        Desafio d3 = new Desafio("Java", "Qual comando para imprimir no console", Categoria.PROGRAMACAO, 5, Nivel.ANALISE);
        Desafio d4 = new Desafio("Python", "Qual comando para imprimir no console", Categoria.PROGRAMACAO, 5, Nivel.ANALISE);
        List<Desafio> desafiosParaSalvar = new ArrayList<>();
        desafiosParaSalvar.add(d1);
        desafiosParaSalvar.add(d3);

//-----------------Salvar desafio-------------------
//       sv.cadastrarDesafio(d2, u5);
//        sv.cadastrarDesafio(d4, u5);
//        for (Desafio d : desafiosParaSalvar){
//            sv.cadastrarDesafio(d, (Professor) u3);
//        }

//-----------------Deletar desafio-------------------
//        rd.deletarPorId(2L);
//        sv.deletarDesafio(6L, u5);

        for (Desafio d : sv.buscarPorCampo("categoria", Categoria.PROGRAMACAO)) {
            System.out.println("Lista Por campo: " + d.getId() + " = " + d.getTitulo() + " : " + d.getCategoria());
        }

        for (Desafio d : sv.buscarTodos()) {
            System.out.println("Lista todos: " + d.getId() + " = " + d.getTitulo() + " : " + d.getCategoria());
        }


        System.out.println("Por ID 3: " + rd.buscarPorId(2L).getTitulo() + " : " + rd.buscarPorId(3L).getProfessor().getNome());







//----------------------------- Respostas ---------------------------------------

       ServiceResposta sr = new ServiceResposta();
        Respostas r1 = new Respostas("A resposta para a soma é 55", d1, u2);
        Respostas r2 = new Respostas("A resposta para multiplicação é 25", d2, u1);
        Respostas r3 = new Respostas("O comando é system.out.println()", d3, u4);
        Respostas r4 = new Respostas("O comando python é print()", d4, u2);

//---------------Salvar Respostas---------------
//        sr.salvarResposta(r1);
//        sr.salvarResposta(r2);
//        sr.salvarResposta(r3);
//        sr.salvarResposta(r4);


//---------------Deletar Respostas---------------
//        sr.deletarResposta(5L, u5);
//        sr.deletarResposta(6L, u5);
//        sr.deletarResposta(7L, u5);
//        sr.deletarResposta(8L, u5);


        for(Respostas r : sr.buscarTodasRespostas(u5)){
            System.out.println("________ Resposta _________");
            System.out.println("Desafio: " + r.getDesafio().getTitulo());
            System.out.println("Resposta: " + r.getResposta());
            System.out.println("Aluno: " + r.getAluno().getNome());
        }

        for (Respostas r : sr.buscarPorAluno(u1)){
            System.out.println(r.getResposta());
            System.out.println(r.getDesafio().getTitulo());
            System.out.println(r.getAluno().getNome());
        }


//        System.out.println("Aluno-Desafio" + sr.buscarPorAlunoDesafio(u1, d1).getResposta());
//        System.out.println("Aluno-Desafio" + sr.buscarPorAlunoDesafio(u1, d2).getAluno().getNome());

//        sr.avaliarResposta(5,r1,u5);
//        for (Respostas r : rr.buscarPorCampo("desafio", r1.getDesafio())){
//            System.out.println(r.getResposta());
//        }
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