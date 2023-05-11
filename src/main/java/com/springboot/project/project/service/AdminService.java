package com.springboot.project.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.project.project.dao.AdminDAO;
import com.springboot.project.project.dao.StudentDAO;
import com.springboot.project.project.entity.Admin;
import com.springboot.project.project.entity.Student;
import com.springboot.project.util.ResponseStructure;

@Service
public class AdminService {
	
	@Autowired
	private AdminDAO adminDao;
	
	@Autowired
	private StudentDAO studentdao;
	
	
	public ResponseEntity<Admin> saveAdmin(Admin admin) {
		Admin admin2= adminDao.saveAdmin(admin);
	    return new ResponseEntity<>(admin2,HttpStatus.OK);
	}
	public ResponseEntity<Admin> findAdminById(int adminId) {
		Admin admin= adminDao.findAdminById(adminId);
		if(admin!null) {
			ResponseStructure<Admin> responseStructure=new ResponseStructure<>();
			responseStructure.
		}
		
	}
	public Admin updateAdmin(int adminId, Admin admin) {
		return adminDao.updateAdminById(adminId, admin);
	}
	public Admin deleteAdmin(int adminId) {
		Admin admin= adminDao.findAdminById(adminId);
		if(admin!=null) {
			adminDao.deleteAdminById(adminId);
			List<Student> students=admin.getStudent();
			for(Student st:students) {
				studentdao.deleteStudent(st);
			}
			return admin;
		}else {
			return null;
		}
	}

}
