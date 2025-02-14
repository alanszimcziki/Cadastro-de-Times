package com.devjava.demo.Titulos;

import com.devjava.demo.Times.TimesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitulosRepository extends JpaRepository<TimesModel, Long> {
}
