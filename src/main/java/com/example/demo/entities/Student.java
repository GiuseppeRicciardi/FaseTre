package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


public class Student {

    private String id;
    private String name;
    private String surname;

    public Student(String id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

}
