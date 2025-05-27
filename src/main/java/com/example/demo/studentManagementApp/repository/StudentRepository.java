package com.example.demo.studentManagementApp.repository;

import com.example.demo.studentManagementApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
