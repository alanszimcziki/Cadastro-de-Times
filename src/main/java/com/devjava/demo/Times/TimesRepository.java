package com.devjava.demo.Times;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesRepository extends JpaRepository<TimesModel, Long> {
}
