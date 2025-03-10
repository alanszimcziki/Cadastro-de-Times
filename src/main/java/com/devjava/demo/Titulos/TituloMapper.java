package com.devjava.demo.Titulos;


import org.springframework.stereotype.Component;

@Component
public class TituloMapper {
    public TitulosModel map(TituloDTO tituloDTO){
        TitulosModel titulosModel = new TitulosModel();
        titulosModel.setId(tituloDTO.getId());
        titulosModel.setNome(tituloDTO.getNome());
        titulosModel.setQuantidade(tituloDTO.getQuantidade());
        return titulosModel;
    }
    public TituloDTO map(TitulosModel titulosModel){
        TituloDTO tituloDTO = new TituloDTO();
        tituloDTO.setId(titulosModel.getId());
        tituloDTO.setNome(titulosModel.getNome());
        tituloDTO.setQuantidade(titulosModel.getQuantidade());
        return tituloDTO;
    }

}
