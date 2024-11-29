package com.dev.poo.Entities;

import com.dev.poo.Aux.Categoria;
import com.dev.poo.Aux.ENivel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "desafio")
public class Desafio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", unique = true)
    private String titulo;

    private String descricao;

    private Categoria categoria;

    private Integer pontuacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "`nivel`")
    private ENivel enivel;

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;


    public Desafio(String titulo, String descricao, Categoria categoria, Integer pontuacao, ENivel nivel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.pontuacao = pontuacao;
        this.enivel = nivel;
    }

    public Desafio() {

    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public ENivel getEnivel() {
        return enivel;
    }

    public void setEnivel(ENivel enivel) {
        this.enivel = enivel;
    }
}
