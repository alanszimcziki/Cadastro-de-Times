package com.devjava.demo.Times;

import com.devjava.demo.Titulos.TitulosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_time")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TimesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String pais;
    private String liga;
    private int capacidade;
    @OneToMany(mappedBy = "times")
    private List<TitulosModel> titulos;



}
