package com.springboot.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.project.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
