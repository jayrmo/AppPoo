package com.dev.poo.Repository;

import com.dev.poo.Entities.Desafio;
import com.dev.poo.EstruturaAbstrata.DAO;

public class RepositoryDesafio extends DAO<Desafio, Long> {
    public RepositoryDesafio(Class<Desafio> tipoEntidade) {
        super(tipoEntidade);
    }
}
