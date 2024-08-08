package com.secproject.secproj.controller;
import com.secproject.secproj.model.Student;
import com.secproject.secproj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public List<Student> get(){
        return studentService.getStudent();
    }
}
