package com.devjava.demo.Titulos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TituloDTO {
    private long id;
    private String nome;
    private int quantidade;
}
