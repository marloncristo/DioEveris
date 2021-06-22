package com.treinamentoeverismarlon.dioeverisapi.repositories;

import com.treinamentoeverismarlon.dioeverisapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
