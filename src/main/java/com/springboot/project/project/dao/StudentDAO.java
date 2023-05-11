package com.springboot.project.project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.project.project.entity.Student;
import com.springboot.project.project.repository.AdminRepo;
import com.springboot.project.project.repository.StudentRepo;

@Repository
public class StudentDAO {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private AdminRepo adminRepo;
	
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
		
	}
	public Student deleteStudent(Student student) {
		studentRepo.delete(student);
		return student;
	}
	public Student getStudentById(int studentId) {
		Optional<Student> optional= studentRepo.findById(studentId);
		Student student=optional.get();
		return student;
	}
	public Student updateStudentById(int id,Student student) {
		Student students=getStudentById(id);
		student.setStudentId(id);
		return studentRepo.save(students);
	}
	public List<Student> getStudents(int adminId){
		Optional<List<Student>> optional=adminRepo.getStudents(adminId);
		if(optional.isEmpty()) {
			return null;
		}else {
			return optional.get();
		}
	}
	
}
