package com.treinamentoeverismarlon.dioeverisapi.countries.resources;

import com.treinamentoeverismarlon.dioeverisapi.countries.entities.Country;
import com.treinamentoeverismarlon.dioeverisapi.countries.repositories.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }

}
