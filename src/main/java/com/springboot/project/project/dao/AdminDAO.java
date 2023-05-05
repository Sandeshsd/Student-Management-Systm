package com.springboot.project.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.project.project.entity.Admin;
import com.springboot.project.project.repository.AdminRepo;

@Repository
public class AdminDAO {

	@Autowired
	private AdminRepo adminRepo;
	
	public Admin saveAdmin(Admin admin) {
	return adminRepo.save(admin);
	}
	
}
