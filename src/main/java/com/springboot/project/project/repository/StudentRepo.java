package com.springboot.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.project.entity.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer>{

}
