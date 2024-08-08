package com.secproject.secproj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;



    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Component

    public class Teacher {
        @Id
        @GeneratedValue
        int fid;
        String name;
        String address;
    }

