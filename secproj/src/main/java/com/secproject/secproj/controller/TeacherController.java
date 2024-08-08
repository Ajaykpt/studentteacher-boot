package com.secproject.secproj.controller;

import com.secproject.secproj.model.Teacher;
import com.secproject.secproj.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController{
    @Autowired
    TeacherService teacherService;
    @GetMapping("/teacher")
    public List<Teacher> getTeacher(){
        return teacherService.getTeacher();
    }
}