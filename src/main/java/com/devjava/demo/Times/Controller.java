package com.devjava.demo.Times;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("times")
public class Controller {

    private TimesService timeService;

    public Controller(TimesService timeService) {
        this.timeService = timeService;
    }

    //TODO: -> CAMINHO DA ROTA
    @GetMapping("/todos")
    public List<TimesModel> listarTodos(){
        return timeService.listarTodosTimes();
    }
    //todo: listar os times pelo id
    @GetMapping("/listar/{id}")
    public TimesModel listarTimesPorId(@PathVariable Long id){
        return timeService.listarTimesPorId(id);
    }
    //todo:criar novo time
    @PostMapping("/criar")
    public TimesModel criarNovoTime(@RequestBody TimesModel time){
        return timeService.criarNovoTime(time);
    }
    @PutMapping("/alterar")
    public String alterarTimePorId(){
        return "Time Alterado";
    }
    @DeleteMapping("/deletar/{id}")
    public void deletarTime(@PathVariable Long id){
        timeService.deletarTime(id);
    }



}
