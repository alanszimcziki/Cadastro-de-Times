package com.devjava.demo.Titulos;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TitulosService {

    private TitulosRepository titulosRepository;

    public TitulosService(TitulosRepository titulosRepository) {
        this.titulosRepository = titulosRepository;
    }

    public List<TitulosModel> listarTodosTitulos(){
       return titulosRepository.findAll();
    }

    public TitulosModel listarPorId(long id){
        Optional<TitulosModel> ninjaPorId = titulosRepository.findById(id);
        return ninjaPorId.orElse(null);
    }


}
