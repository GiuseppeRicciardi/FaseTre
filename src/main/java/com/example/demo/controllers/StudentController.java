package com.example.demo.controllers;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/registration")
    public Student registration(@RequestBody Student s){
        return studentService.studentRegistration(s);
    }

    @GetMapping("/returnAll")
    public ArrayList<Student> returnStudents(){
        return studentService.returnAll();
    }
}
