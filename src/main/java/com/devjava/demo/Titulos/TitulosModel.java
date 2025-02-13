package com.devjava.demo.Titulos;

import com.devjava.demo.Times.TimesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_titulos")
public class TitulosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name="times_id") //todo:foreing key chave estrangeira
    private TimesModel times;

}
