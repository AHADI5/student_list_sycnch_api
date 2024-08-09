package com.example.controllappapi.controller;

import com.example.controllappapi.model.Student;
import com.example.controllappapi.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public record Controller(
        StudentService studentService
) {
    @GetMapping ("/")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }


}
