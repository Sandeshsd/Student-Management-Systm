package com.springboot.project.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.project.entity.Student;
import com.springboot.project.project.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	 @Autowired
	 private StudentService studentservice;
	 
	 @PostMapping
	 public Student saveStudent(@RequestBody Student student, @RequestParam int adminId) {
		 return studentservice.saveStudent(student,adminId);
	 }
	 @GetMapping
	 public Student findAdminById(@RequestParam int studentId) {
		 return studentservice.getElementById(studentId);
	 }
	 @PutMapping
	 public Student updateStudentById(@RequestParam int studentId,@RequestBody Student student) {
		 return studentservice.updateStudent(studentId, student);
	 }
	 @GetMapping("/admin")
	 public List<Student> getStudents(@RequestParam int adminId){
		 return studentservice.getStudents(adminId);
	 }
}
