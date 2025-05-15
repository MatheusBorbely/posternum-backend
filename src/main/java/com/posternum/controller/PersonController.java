package com.posternum.controller;

import com.posternum.entity.PersonEntity;
import com.posternum.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public PersonEntity create(@RequestBody PersonEntity person) {
        return service.create(person);
    }
}
