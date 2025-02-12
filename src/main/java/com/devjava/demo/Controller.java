package com.devjava.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")                               //TODO: -> CAMINHO DA ROTA
    public String boasVindas(){
        return "ESSA É MINHA PRIMEIRA MENSAGEM NESSA ROTA";
    }


}
