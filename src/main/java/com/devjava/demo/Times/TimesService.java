package com.devjava.demo.Times;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimesService {
    private TimesRepository timesRepository;
    private TimeMapper timeMapper;

    public TimesService(TimesRepository timesRepository, TimeMapper timeMapper) {
        this.timesRepository = timesRepository;
        this.timeMapper = timeMapper;
    }

    public List<TimesModel> listarTodosTimes(){
        return timesRepository.findAll();
    }
    public TimesModel listarTimesPorId(Long id){
        Optional<TimesModel> timeId = timesRepository.findById(id);
        return timeId.orElse(null);
    }
    public TimeDTO criarNovoTime(TimeDTO timesDto){
        TimesModel time = timeMapper.map(timesDto);
        time = timesRepository.save(time);
        return timeMapper.map(time);
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
