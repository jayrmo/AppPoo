package com.dev.poo.Service;

import com.dev.poo.Entities.Desafio;
import com.dev.poo.Repository.RepositoryDesafio;

public class ServiceProfessor {
    private RepositoryDesafio repositoryDesafio;


    public void cadastrarDesafio(Desafio desafio){
        repositoryDesafio.salvar(desafio);
    }
}
