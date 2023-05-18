package com.example.demo.services;

import com.example.demo.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    ArrayList<Student> students;

    public ArrayList<Student> returnAll(){
        return students;
    }

    public Student studentRegistration(Student s){
        students.add(s);
        return s;
    }
}
