package com.devjava.demo.Titulos;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("titulos")
public class TitulosController {

    @GetMapping("/listar")
    public String listarTitulo(){
        return "Lista todos os titulos";
    }
    @PostMapping("/criar")
    public String criarTitulo(){
        return "Cria um novo título";
    }
    @PutMapping("/alterar")
    public String alteraTitulo(){
        return "Vai alterar um título";
    }
    @DeleteMapping("/deletar")
    public String deletaTitulo(){
        return "Vai deletar um título";
    }
}
