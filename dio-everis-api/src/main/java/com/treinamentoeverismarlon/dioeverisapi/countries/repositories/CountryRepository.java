package com.treinamentoeverismarlon.dioeverisapi.countries.repositories;

import com.treinamentoeverismarlon.dioeverisapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
