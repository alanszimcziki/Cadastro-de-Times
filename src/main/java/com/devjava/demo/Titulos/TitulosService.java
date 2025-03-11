package com.devjava.demo.Titulos;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TitulosService {

    private final TitulosRepository titulosRepository;
    private final TituloMapper tituloMapper;

    public TitulosService(TitulosRepository titulosRepository, TituloMapper tituloMapper) {
        this.titulosRepository = titulosRepository;
        this.tituloMapper = tituloMapper;
    }

    public List<TituloDTO> listarTodosTitulos(){
       List<TitulosModel> titulos = titulosRepository.findAll();
       return titulos.stream().
               map(tituloMapper :: map).
               collect(Collectors.toList());
    }

    public TituloDTO listarPorId(long id){
        Optional<TitulosModel> tituloPorId = titulosRepository.findById(id);
        return tituloPorId.map(tituloMapper :: map).orElse(null);
    }

    public TituloDTO criarTitulo(TituloDTO tituloDTO){
        TitulosModel titulo = tituloMapper.map(tituloDTO);
        titulo = titulosRepository.save(titulo);
        return tituloMapper.map(titulo);

    }
    public void deletarTitulo(Long id){
         titulosRepository.deleteById(id);
    }
    public TituloDTO atualizaTitulo(Long id, TituloDTO titulo){
       Optional <TitulosModel> tituloExistente = titulosRepository.findById(id);
       if(tituloExistente.isPresent()){
           TitulosModel tituloAtualizado = tituloMapper.map(titulo);
           tituloAtualizado.setId(id);
           TitulosModel tituloSalvo = titulosRepository.save(tituloAtualizado);
           return tituloMapper.map(tituloSalvo);
       }
       return null;
    }


}
