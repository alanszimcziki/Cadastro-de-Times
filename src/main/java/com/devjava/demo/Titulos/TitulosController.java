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
    public List<TituloDTO> listarTodosTitulos(){
        return titulosService.listarTodosTitulos();
    }
    @GetMapping("/listar/{id}")
    public TituloDTO listarPorId( @PathVariable Long id){
        return titulosService.listarPorId(id);
    }
    @PostMapping("/criar")
    public TituloDTO criarTitulo(@RequestBody TituloDTO titulo){
        return titulosService.criarTitulo(titulo);
    }
    @PutMapping("/alterar/{id}")
    public TituloDTO alteraTitulo(@PathVariable Long id, @RequestBody TituloDTO titulo){
        return titulosService.atualizaTitulo(id,titulo);
    }
    @DeleteMapping("/deletar/{id}")
    public void deletaTitulo(@PathVariable Long id){
         titulosService.deletarTitulo(id);
    }
}
