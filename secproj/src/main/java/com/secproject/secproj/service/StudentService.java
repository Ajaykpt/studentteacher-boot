package com.secproject.secproj.service;


import com.secproject.secproj.model.Student;
import com.secproject.secproj.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;

    public List<Student> getStudent(){

        return  repo.findAll();
    }
}
