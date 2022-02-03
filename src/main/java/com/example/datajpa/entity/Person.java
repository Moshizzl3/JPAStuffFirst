package com.example.datajpa.entity;

import javax.persistence.*;

@Entity(name = "Person")
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue
    long id;
    @Column(name ="name")
    String name;

    public Person() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
}
