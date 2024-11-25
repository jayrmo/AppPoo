package com.dev.poo.Repository;

import com.dev.poo.Entities.Professor;
import com.dev.poo.EstruturaAbstrata.DAO;

public class RepositoryProfessor extends DAO<Professor, Long> {
    public RepositoryProfessor(Class<Professor> tipoEntidade) {
        super(tipoEntidade);
    }
}
