package com.devjava.demo.Times;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("times")
public class Controller {

    //TODO: -> CAMINHO DA ROTA
    @GetMapping("/todos")
    public String boasVindas(){
        return "Listar todos os times";
    }
    //todo: listar os times pelo id
    @GetMapping("/listar")
    public String listarTimesPeloId(){
        return "Times listado por ID";
    }
    //todo:criar novo time
    @PostMapping("/criar")
    public String criarNovoTime(){
        return "Time Criado";
    }
    @PutMapping("/alterar")
    public String alterarTimePorId(){
        return "Time Alterado";
    }
    @DeleteMapping("/deletar")
    public String deletarTimePorId(){
        return "Time Deletado";
    }



}
