package com.dev.poo;


import com.dev.poo.Aux.TipoUsuario;
import com.dev.poo.Entities.Aluno;
import com.dev.poo.Entities.Professor;
import com.dev.poo.Entities.Usuario;
import com.dev.poo.Repository.RepositoryUsuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbJardim");
//        EntityManager em = emf.createEntityManager();
//        Usuario u = new Aluno();
        Usuario u1 = new Usuario();
        RepositoryUsuario ru = new RepositoryUsuario(Usuario.class);
        u1.setNome("jayr");
        u1.setEmail("jayr.jm7@gmail.com");
        u1.setSenha("123");
        u1.setTipo(TipoUsuario.ALUNO);
        ru.deletarPorId(ru.buscarPorCampo("email","jayr.jm7@gmail.com" ).getId());
        System.out.println(ru.buscarPorCampo("email","jayr.jm7@gmail.com" ).getId());
//        ru.atualizar(u1);
//        ru.salvar(u1);
//        System.out.println(ru.buscarTodos());
        ru.fecharConexao();//
//        u.setNome("Pablo");
//        u.setEmail("pablo@unifi.edu.br");
//        u.setSenha("123456");



//        ru.atualizar(u1);
//        System.out.println(ru.buscarPorCampo("email", "jayr.jm7@gmail.com").getNome());
//        Long id = ru.buscarPorCampo("email", "jayr.jm7@gmail.com");
//        System.out.println(ru.buscarPorId(id).getTipo());
//        Long ID = 7L;
//        System.out.println(ru.buscarPorId(ID).getNome());

//        System.out.println(id);
//        ru.deletarPorId(ID);
//        ru.salvar(u1);
//        ru.fecharConexao();

//        System.out.println("Usuario cadastrado com sucesso!");


//        try {
//           EntityManager em = emf.createEntityManager();
//
//           System.out.println("Conexão realizada com sucesso!");
//           em.close();
//           emf.close();
//        } catch (Exception e) {
//            System.err.println("Erro" + e.getMessage());
//            e.printStackTrace();
//        }
    }
}