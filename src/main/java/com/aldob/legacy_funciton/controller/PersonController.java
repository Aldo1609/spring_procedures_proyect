package com.aldob.legacy_funciton.controller;

import com.aldob.legacy_funciton.entity.Person;
import com.aldob.legacy_funciton.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository personRepository;

    @Transactional
    @GetMapping
    public List<Person> verPersonas(){
        return personRepository.verPersonas();
    }

    @Transactional
    @GetMapping(value = "/{id}")
    public Person buscarPersona(@PathVariable Long id){
        return personRepository.buscarPersona(id);
    }



}
