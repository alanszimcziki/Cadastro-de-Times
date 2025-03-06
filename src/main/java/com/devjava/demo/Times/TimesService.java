package com.devjava.demo.Times;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimesService {
    private TimesRepository timesRepository;

    public TimesService(TimesRepository timesRepository) {
        this.timesRepository = timesRepository;
    }

    public List<TimesModel> listarTodosTimes(){
        return timesRepository.findAll();
    }
}
