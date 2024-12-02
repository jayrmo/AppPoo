package com.dev.poo.Entities;


import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "aluno")
public class Aluno extends Usuario {

    @Column(name = "pontos_acumulados")
    private Integer pontosAcumulados;

    @ManyToOne
    @JoinColumn(name = "classificacao_id")
    private Classificacao classificacao;

    @ManyToMany(mappedBy = "alunos")
    private List<Desafio> desafios;

    public List<Desafio> getDesafios() {
        return desafios;
    }

    public void setDesafios(List<Desafio> desafios) {
        this.desafios = desafios;
    }

    public Integer getPontosAcumulados() {
        return pontosAcumulados;
    }

    public void setPontosAcumulados(Integer pontosAcumulados) {
        this.pontosAcumulados = pontosAcumulados;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
}
