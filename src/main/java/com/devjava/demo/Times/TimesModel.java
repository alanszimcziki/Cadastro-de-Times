package com.devjava.demo.Times;

import com.devjava.demo.Titulos.TitulosModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tb_time")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(exclude = "titulos")
public class TimesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "imagem")
    private String img_url;

    @Column(name = "pais")
    private String pais;

    @Column(name = "campeonato")
    private String liga;

    @Column(name = "Capacidade_estadio")
    private int capacidade;

    @OneToMany(mappedBy = "times")
    @JsonIgnore
    private List<TitulosModel> titulos;



}
