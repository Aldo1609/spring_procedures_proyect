package com.aldob.legacy_funciton.repository;

import com.aldob.legacy_funciton.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Procedure
    List<Person> verPersonas();

    @Procedure
    Person buscarPersona(Long id);


}
