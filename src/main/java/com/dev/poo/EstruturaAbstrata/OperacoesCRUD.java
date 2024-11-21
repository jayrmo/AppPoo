package com.dev.poo.EstruturaAbstrata;

import java.util.List;

public interface OperacoesCRUD<Tipo, ID> {

    void salvar(Tipo entidade);
    Tipo buscarPorId(ID id);
    List<Tipo> buscarTodos();
    void deletar(Tipo entidade);
    void deletarPorId(ID id);
    void atualizar(Tipo entidade);
}
