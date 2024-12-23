package com.dev.poo.Aux;

public enum ENivel {
    CONHECIMENTO(1),
    SINTESE(2),
    COMPREENSAO(3),
    ANALISE(4),
    AVALIACAO(5),
    APLICACAO(6);

    private final Integer valor;

    ENivel(Integer nivel) {

        this.valor = nivel;
    }

    public Integer getValor() {

        return valor;
    }

    public static ENivel encontrarPorValor(int valor) {
        for (ENivel nivel : ENivel.values()) {
            if (nivel.getValor() == valor) {
                return nivel;
            }
        }
        throw new IllegalArgumentException("Nível não encontrado para o valor: " + valor);
    }
}
