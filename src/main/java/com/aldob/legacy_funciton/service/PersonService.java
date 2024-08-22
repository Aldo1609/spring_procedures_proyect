package com.aldob.legacy_funciton.service;

import com.aldob.legacy_funciton.entity.Person;
import com.aldob.legacy_funciton.exception.PersonServiceException;
import com.aldob.legacy_funciton.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> verPersonas(){

        try{
            return this.personRepository.verPersonas();
        }catch (Exception e){
            throw new PersonServiceException("Error al obtener la lista de personas", e);
        }
    }

    public Person buscarPersona(Long id){

        try {
            return this.personRepository.buscarPersona(id);
        }catch (Exception e){
            throw new PersonServiceException("Error al buscar persona con id " + id, e);
        }
    }


}

