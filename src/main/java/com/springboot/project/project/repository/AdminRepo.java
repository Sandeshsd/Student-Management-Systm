package com.springboot.project.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.project.project.entity.Admin;
import com.springboot.project.project.entity.Student;

public interface AdminRepo extends JpaRepository<Admin, Integer>{
	
	@Query(value="select a.students from Admin a where a.adminId=?1")
	public Optional<List<Student>> getStudents(int adminId);

}
