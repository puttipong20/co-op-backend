package com.example.coop.controller;

import com.example.coop.model.StudentModel;
import com.example.coop.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<StudentModel> getData(){
        return studentRepository.findAll();
    }

    @PostMapping
    public StudentModel addStudent(@RequestBody StudentModel studentModel){
        return studentRepository.save(studentModel);
    }

}
