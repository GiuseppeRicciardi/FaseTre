package com.example.demo.services;

import com.example.demo.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ListConfig {
    @Bean
    public ArrayList<Student> students(){
        ArrayList<Student> list = new ArrayList<Student>();
        return list;
    }
}
