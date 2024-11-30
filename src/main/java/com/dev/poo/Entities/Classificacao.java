package com.dev.poo.Entities;

import com.dev.poo.Aux.ENivel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "classificacao")
public class Classificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pontuacao_minima")
    private Integer pontuacaoMinima;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private ENivel nivel;

    @OneToMany(mappedBy = "classificacao")
    private List<Aluno> alunos;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Integer getPontuacaoMinima() {
        return pontuacaoMinima;
    }

    public void setPontuacaoMinima(Integer pontuacaoMinima) {
        this.pontuacaoMinima = pontuacaoMinima;
    }

    public ENivel getNivel() {
        return nivel;
    }

    public void setNivel(ENivel nivel) {
        this.nivel = nivel;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
