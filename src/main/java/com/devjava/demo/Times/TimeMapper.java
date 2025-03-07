package com.devjava.demo.Times;

import org.springframework.stereotype.Component;

@Component
public class TimeMapper {

    public TimesModel map(TimeDTO timeDto){
        TimesModel timeModel = new TimesModel();
        timeModel.setId(timeDto.getId());
        timeModel.setNome(timeDto.getNome());
        timeModel.setEmail(timeDto.getEmail());
        timeModel.setLiga(timeDto.getLiga());
        timeModel.setPais(timeDto.getPais());
        timeModel.setCapacidade(timeDto.getCapacidade());
        timeModel.setImg_url(timeDto.getImg_url());
        return timeModel;
    }
    public TimeDTO map(TimesModel timeModel){
        TimeDTO timeDto = new TimeDTO();
        timeDto.setId(timeModel.getId());
        timeDto.setNome(timeModel.getNome());
        timeDto.setLiga(timeModel.getLiga());
        timeDto.setEmail(timeModel.getEmail());
        timeDto.setPais(timeModel.getPais());
        timeDto.setCapacidade(timeModel.getCapacidade());
        timeDto.setImg_url(timeModel.getImg_url());
        return timeDto;
    }


}