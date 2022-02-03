package com.example.datajpa.controller;

import com.example.datajpa.entity.Person;
import com.example.datajpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    PersonService personService;

    public WebController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/ok")
    public String oka(){
        Person person = personService.getPerson(1);
        System.out.println(person.getName());
        return "redirect:/";
    }

}
