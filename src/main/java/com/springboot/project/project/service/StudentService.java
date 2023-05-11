package com.springboot.project.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.project.dao.AdminDAO;
import com.springboot.project.project.dao.StudentDAO;
import com.springboot.project.project.entity.Admin;
import com.springboot.project.project.entity.Student;

@Service
public class StudentService {

	
	@Autowired
	private StudentDAO dao;
	
	@Autowired
	private AdminDAO adminDAO;
	
	public Student saveStudent(Student student, int adminId) {
		
		Admin admin=adminDAO.findAdminById(adminId);
		List<Student> students=admin.getStudent();
		students.add(student);
		admin.setStudent(students);
		adminDAO.saveAdmin(admin);
	 return	dao.saveStudent(student);
	}

	public Student getElementById(int studentId ) {
		return dao.getStudentById(studentId);
	}
	public Student updateStudent(int studentId,Student student) {
		return dao.updateStudentById(studentId, student);
	}
	public List<Student> getStudents(int adminId){
		return dao.getStudents(adminId);
	}
	
	
}
