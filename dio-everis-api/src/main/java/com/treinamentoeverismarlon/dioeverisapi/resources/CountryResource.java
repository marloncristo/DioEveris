package com.treinamentoeverismarlon.dioeverisapi.resources;

import com.treinamentoeverismarlon.dioeverisapi.countries.Country;
import com.treinamentoeverismarlon.dioeverisapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    private CountryRepository repository;

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
    }

}
