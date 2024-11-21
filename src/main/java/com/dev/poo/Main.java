package com.dev.poo;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbJardim");
            EntityManager em = emf.createEntityManager();

            System.out.println("Conexão realizada com sucesso!");
            em.close();
            emf.close();
        } catch (Exception e) {
            System.err.println("Erro" + e.getMessage());
            e.printStackTrace();
        }
    }
}