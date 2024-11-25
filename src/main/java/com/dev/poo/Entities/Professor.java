package com.dev.poo.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "professor")
public class Professor extends Usuario {
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Desafio> desafios;

    public List<Desafio> getDesafios() {
        return desafios;
    }

    public void setDesafios(List<Desafio> desafios) {
        this.desafios = desafios;
    }

}
