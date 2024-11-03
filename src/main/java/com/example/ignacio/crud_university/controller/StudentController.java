package com.example.ignacio.crud_university.controller;

import com.example.ignacio.crud_university.entities.Student;
import com.example.ignacio.crud_university.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired

    private StudentService studentService;

    @PostMapping
    public Student saveUpdate(@RequestBody Student student){
        return studentService.create(student);
    }

    @GetMapping
    public List<Student>getAll(){
        return studentService.findAll();
    }

    @GetMapping ("/{id}")
    public Optional<Student> getById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable Long id){
        studentService.deleteById(id);
    }
}
