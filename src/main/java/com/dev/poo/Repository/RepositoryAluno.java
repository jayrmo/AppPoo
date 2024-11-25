package com.dev.poo.Repository;

import com.dev.poo.Entities.Aluno;
import com.dev.poo.EstruturaAbstrata.DAO;

public class RepositoryAluno extends DAO<Aluno, Long> {
    public RepositoryAluno(Class<Aluno> tipoEntidade) {
        super(tipoEntidade);
    }
}
