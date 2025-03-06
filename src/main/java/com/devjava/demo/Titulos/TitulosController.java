package com.devjava.demo.Titulos;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("titulos")
public class TitulosController {

    private TitulosService titulosService;

    public TitulosController(TitulosService titulosService) {
        this.titulosService = titulosService;
    }

    @GetMapping("/listar")
    public List<TitulosModel> listarTodosTitulos(){
        return titulosService.listarTodosTitulos();
    }
    @GetMapping("/listar/{id}")
    public TitulosModel listarPorId( @PathVariable Long id){
        return titulosService.listarPorId(id);
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
