package com.dev.poo.Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "respostas", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"aluno_id", "desafio_id"})})
public class Respostas {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String resposta;

    @ManyToOne
    @JoinColumn(name = "desafio_id")
    private Desafio desafio;

    private Integer avaliacao;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public Respostas(String resposta, Desafio desafio, Aluno aluno) {
        this.resposta = resposta;
        this.desafio = desafio;
        this.aluno = aluno;
    }

    public Respostas() {

    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Desafio getDesafio() {
        return desafio;
    }

    public void setDesafio(Desafio desafio) {
        this.desafio = desafio;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
