package com.dev.poo.EstruturaAbstrata;

import java.util.List;

public interface OperacoesCRUD<Tipo, ID> {

    Tipo salvar(Tipo entidade);

    Tipo buscarPorId(ID id);

    List<Tipo> buscarPorCampo(String nomeCampo, Tipo tipoEntidade);
    Tipo buscarUnicaPorCampo(String nomeCampo, Tipo tipoEntidade);

    List<Tipo> buscarTodos();

    void atualizar(Tipo entidade);

    void deletarPorId(ID id);

    void deletar(Tipo entidade);


    void fecharConexao();

}
