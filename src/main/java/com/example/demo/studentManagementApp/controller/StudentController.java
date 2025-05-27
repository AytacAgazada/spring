package com.example.demo.studentManagementApp.controller;

import com.example.demo.studentManagementApp.model.Student;
import com.example.demo.studentManagementApp.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @PostMapping
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }
    @GetMapping
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

}
