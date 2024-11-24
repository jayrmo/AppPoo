package com.dev.poo.Repository;

import com.dev.poo.Entities.Respostas;
import com.dev.poo.EstruturaAbstrata.DAO;

public class RepositoryResposta extends DAO<Respostas, Long> {
    public RepositoryResposta(Class<Respostas> tipoEntidade) {
        super(tipoEntidade);
    }
}
