package com.devjava.demo.Titulos;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("titulos")
public class TitulosController {

    private final TitulosService titulosService;

    public TitulosController(TitulosService titulosService) {
        this.titulosService = titulosService;
    }

    @GetMapping("/listar")
    public  ResponseEntity<List<TituloDTO>> listarTodosTitulos() {
        List<TituloDTO> titulo = titulosService.listarTodosTitulos();
        return ResponseEntity.ok(titulo);

    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id) {
        TituloDTO titulo = titulosService.listarPorId(id);
        if(titulo != null){
            return ResponseEntity.ok(titulo);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível encontrar esse título ");
        }
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarTitulo(@RequestBody TituloDTO titulos) {
        TituloDTO titulo = titulosService.criarTitulo(titulos);
        return ResponseEntity.status(HttpStatus.CREATED).body("Título Criado com Sucesso " + titulo.getNome());
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alteraTitulo(@PathVariable Long id, @RequestBody TituloDTO titulos) {
        TituloDTO procuraTitulo = titulosService.listarPorId(id);

        if(procuraTitulo != null){
            TituloDTO titulo = titulosService.atualizaTitulo(id, titulos);
            return ResponseEntity.ok(titulo);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível atualizar esse título ");
        }

    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletaTitulo(@PathVariable Long id) {
        TituloDTO procuraTitulo = titulosService.listarPorId(id);
        if ( procuraTitulo != null) {
            titulosService.deletarTitulo(id);
           return ResponseEntity.ok().body("Título Deletado com Sucesso !");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi posível encontrar o título");
        }
    }
}
