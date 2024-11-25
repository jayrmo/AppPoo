package com.dev.poo.Entities;


import com.dev.poo.Aux.Nivel;
import jakarta.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno extends Usuario {

    @Column(name = "pontuacao_total", nullable = false)
    private Integer pontuacao_total;

    private Nivel nivel;

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Integer getPontuacao_total() {
        return pontuacao_total;
    }

    public void setPontuacao_total(Integer pontuacao_total) {
        this.pontuacao_total += pontuacao_total;
    }
}
