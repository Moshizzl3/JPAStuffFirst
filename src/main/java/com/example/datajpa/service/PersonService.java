package com.example.datajpa.service;

import com.example.datajpa.entity.Person;
import com.example.datajpa.repos.PersonRepository;
import org.springframework.stereotype.Component;


@Component
public class PersonService {

    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPerson(long id){
        return personRepository.getById(id);
    }

}
