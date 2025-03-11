package com.devjava.demo.Times;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("times")
public class TimeController {

    private final TimesService timeService;

    public TimeController(TimesService timeService) {
        this.timeService = timeService;
    }

    //TODO: -> CAMINHO DA ROTA
    @GetMapping("/listar")
    public ResponseEntity<List<TimeDTO>> listarTodos(){
        List<TimeDTO> time =  timeService.listarTodosTimes();
        return ResponseEntity.ok(time);
    }
    //todo: listar os times pelo id
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarTimesPorId(@PathVariable Long id){
        TimeDTO time = timeService.listarTimesPorId(id);

        if(time != null){
            return ResponseEntity.ok(time);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possível encontrar esse time");
        }
    }
    //todo:criar novo time
    @PostMapping("/criar")
    public ResponseEntity<String> criarNovoTime(@RequestBody TimeDTO time){
        TimeDTO novoTime = timeService.criarNovoTime(time);
        return ResponseEntity.status(HttpStatus.CREATED).body("Time Criado com Sucesso: " + novoTime.getNome());

    }
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarTimePorId(@PathVariable Long id, @RequestBody TimeDTO times){
        TimeDTO procuraTime = timeService.listarTimesPorId(id);
        if(procuraTime != null){
            TimeDTO time = timeService.atualizaTimes(id,times);
            return ResponseEntity.ok(time);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Time não encontrado, não foi possível alterar o time");
        }
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarTime(@PathVariable Long id){
        TimeDTO procuraTime = timeService.listarTimesPorId(id);
       if(procuraTime != null){
           timeService.deletarTime(id);
           return ResponseEntity.ok().body("Time Deletado com Sucesso ");
       }else{
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Time não encontrado ");
       }


    }




}

