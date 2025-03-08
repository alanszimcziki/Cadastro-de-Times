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

    public TitulosModel criarTitulo(TitulosModel titulos){
        return titulosRepository.save(titulos);
    }
    public void deletarTitulo(Long id){
         titulosRepository.deleteById(id);
    }
    public TitulosModel atualizaTitulo(Long id, TitulosModel titulo){
        if(titulosRepository.existsById(id)){
            titulo.setId(id);
            return titulosRepository.save(titulo);
        }
        return null;
    }


}
