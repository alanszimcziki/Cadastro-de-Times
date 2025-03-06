package com.devjava.demo.Times;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    //TODO: -> CAMINHO DA ROTA
    @GetMapping("/todos")
    public String boasVindas(){
        return "Listar todos os times";
    }
    //todo: listar os times pelo id
    @GetMapping("/listarTimes")
    public String listarTimesPeloId(){
        return "Times listado por ID";
    }
    //todo:criar novo time
    @PostMapping("/criarTime")
    public String criarNovoTime(){
        return "Time Criado";
    }
    @PutMapping("/alterarTime")
    public String alterarTimePorId(){
        return "Time Alterado";
    }
    @DeleteMapping("/deletarTime")
    public String deletarTimePorId(){
        return "Time Deletado";
    }



}
