package com.posternum.service;

import com.posternum.entity.PersonEntity;
import com.posternum.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public PersonEntity create(PersonEntity person) {
        return repository.save(person);
    }
}
