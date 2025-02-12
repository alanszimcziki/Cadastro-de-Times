package com.devjava.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class TimeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String pais;
    private String liga;
    private int capacidade;

    public TimeModel() {
    }

    public TimeModel(long id, String nome, String email, String pais, String liga, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.pais = pais;
        this.liga = liga;
        this.capacidade = capacidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
