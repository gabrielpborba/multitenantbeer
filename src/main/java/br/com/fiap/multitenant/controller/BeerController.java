package br.com.fiap.multitenant.controller;


import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.multitenant.model.Beer;
import br.com.fiap.multitenant.repository.BeerRepository;

@RestController
@RequestMapping(value = "/beer")
public class BeerController {

    @Autowired
    private BeerRepository beerRepository;

    @GetMapping
    public Iterator<Beer> getAll() {
        return beerRepository.findAll().iterator();
    }

    @PostMapping
    public void save(@RequestBody Beer beer) {
        beerRepository.save(beer);
    }

}
