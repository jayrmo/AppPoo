package com.dev.poo.Aux;

public enum Nivel {
    CONHECIMENTO(1),
    SINTESE(2),
    COMPREENSAO(3),
    ANALISE(4),
    AVALIACAO(5),
    APLICACAO(6);

    private final Integer valor;

    Nivel(Integer nivel) {
        this.valor = nivel;
    }

    public Integer getValor() {
        return valor;
    }
}
