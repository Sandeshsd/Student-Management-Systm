package com.springboot.project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.project.dao.AdminDAO;
import com.springboot.project.project.entity.Admin;

@RestController
public class AdminController {

	@Autowired
	private AdminDAO adminDao;
	
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
      return adminDao.saveAdmin(admin);
		
	}
}
