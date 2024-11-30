package com.dev.poo.Repository;

import com.dev.poo.Entities.Classificacao;
import com.dev.poo.EstruturaAbstrata.DAO;

public class RepositoryClassificacao extends DAO<Classificacao, Long> {
    public RepositoryClassificacao(Class<Classificacao> tipoEntidade) {
        super(tipoEntidade);
    }
}
