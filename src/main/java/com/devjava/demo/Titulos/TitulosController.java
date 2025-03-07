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
    public TitulosModel criarTitulo(@RequestBody TitulosModel titulo){
        return titulosService.criarTitulo(titulo);
    }
    @PutMapping("/alterar/{id}")
    public TitulosModel alteraTitulo(@PathVariable Long id, @RequestBody TitulosModel titulo){
        return titulosService.atualizaTitulo(id,titulo);
    }
    @DeleteMapping("/deletar/{id}")
    public void deletaTitulo(@PathVariable Long id){
         titulosService.deletarTitulo(id);
    }
}
