package com.devjava.demo.Times;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeDTO {

    private long id;
    private String nome;
    private String email;
    private String img_url;
    private String pais;
    private String liga;
    private int capacidade;

}
