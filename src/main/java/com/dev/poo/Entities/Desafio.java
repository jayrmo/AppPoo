package com.dev.poo.Entities;

import com.dev.poo.Aux.Categoria;
import com.dev.poo.Aux.Nivel;
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
    private Nivel nivel;

//    @ManyToOne
//    @JoinColumn(name = "professor_id", nullable = false)
//    private Usuario professor;
//
//    @ManyToMany(mappedBy = "desafios")
//    private List<Aluno> alunos;


    public Desafio(String titulo, String descricao, Categoria categoria, Integer pontuacao, Nivel nivel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public Desafio() {

    }
//
//    public List<Aluno> getAlunos() {
//        return alunos;
//    }
//
//    public void setAlunos(List<Aluno> alunos) {
//        this.alunos = alunos;
//    }
//
//    public Usuario getProfessor() {
//        return professor;
//    }
//
//    public void setProfessor(Usuario professor) {
//        this.professor = professor;
//    }


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

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
}
