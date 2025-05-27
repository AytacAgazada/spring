package com.example.demo.studentManagementApp.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;


}
