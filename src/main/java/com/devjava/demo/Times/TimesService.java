package com.devjava.demo.Times;

import com.devjava.demo.Titulos.TitulosModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimesService {
    private TimesRepository timesRepository;

    public TimesService(TimesRepository timesRepository) {
        this.timesRepository = timesRepository;
    }
    public List<TimesModel> listarTodosTimes(){
        return timesRepository.findAll();
    }
    public TimesModel listarTimesPorId(Long id){
        Optional<TimesModel> timeId = timesRepository.findById(id);
        return timeId.orElse(null);
    }
    public TimesModel criarNovoTime(TimesModel times){
        return timesRepository.save(times);
    }
    public void deletarTime(Long id){
        timesRepository.deleteById(id);
    }
    public TimesModel atualizaTimes(Long id, TimesModel time){
        if(timesRepository.existsById(id)){
            time.setId(id);
            return timesRepository.save(time);
        }
        return null;
    }

}
