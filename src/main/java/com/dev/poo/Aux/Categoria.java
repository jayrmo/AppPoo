package com.dev.poo.Aux;

public enum Categoria {
    PROGRAMACAO("Desafios relacionados a desenvolvimento de software e lógica."),
    REDES("Desafios envolvendo redes de computadores e conectividade."),
    LOGICA("Desafios que testam habilidades de raciocínio lógico."),
    MATEMATICA("Desafios de cálculos, lógica matemática e problemas numéricos."),
    PORTUGUES("Desafios de gramática, interpretação de texto e redação.");

    private final String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
