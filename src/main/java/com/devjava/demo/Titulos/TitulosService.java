package com.devjava.demo.Titulos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitulosService {

    private TitulosRepository titulosRepository;

    public TitulosService(TitulosRepository titulosRepository) {
        this.titulosRepository = titulosRepository;
    }

    public List<TitulosModel> listarTodosTitulos(){
       return titulosRepository.findAll();

    }


}
