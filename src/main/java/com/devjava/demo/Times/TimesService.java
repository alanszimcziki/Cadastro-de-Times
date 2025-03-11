package com.devjava.demo.Times;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TimesService {
    private final TimesRepository timesRepository;
    private final TimeMapper timeMapper;

    public TimesService(TimesRepository timesRepository, TimeMapper timeMapper) {
        this.timesRepository = timesRepository;
        this.timeMapper = timeMapper;
    }

    public List<TimeDTO> listarTodosTimes(){
        List<TimesModel> times = timesRepository.findAll();
        return times.stream()
                .map(timeMapper :: map).
                collect(Collectors.toList());
    }
    public TimeDTO listarTimesPorId(Long id){
        Optional<TimesModel> timeId = timesRepository.findById(id);
        return timeId.map(timeMapper ::map).orElse(null);
    }
    public TimeDTO criarNovoTime(TimeDTO timesDto){
        TimesModel time = timeMapper.map(timesDto);
        time = timesRepository.save(time);
        return timeMapper.map(time);
    }
    public void deletarTime(Long id){
        timesRepository.deleteById(id);
    }
    public TimeDTO atualizaTimes(Long id, TimeDTO time){
        Optional<TimesModel> timeExistente= timesRepository.findById(id);
        if(timeExistente.isPresent()){
            TimesModel timeAtualizado = timeMapper.map(time);
            timeAtualizado.setId(id);
            TimesModel timeSalvo = timesRepository.save(timeAtualizado);
            return timeMapper.map(timeSalvo);
        }
        return null;

    }

}
