package com.secproject.secproj.service;

import com.secproject.secproj.model.Teacher;
import com.secproject.secproj.repo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService{
    @Autowired
    TeacherRepository repo;
    public List<Teacher> getTeacher(){
        return repo.findAll();
    }
}
