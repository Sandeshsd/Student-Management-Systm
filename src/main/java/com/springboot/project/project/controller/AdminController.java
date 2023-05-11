
package com.springboot.project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.project.entity.Admin;
import com.springboot.project.project.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin) {
      return adminService.saveAdmin(admin);
		
	}
	@GetMapping
		public ResponseEntity<Admin> findAdminById(@RequestParam int adminId) {
			return adminService.findAdminById(adminId);
		
	}
	@PutMapping
	public Admin updateAdminById(@RequestParam int adminId,@RequestBody Admin admin) {
		return adminService.updateAdmin(adminId, admin);
	}
	@DeleteMapping
	public Admin deleteAdminById(@RequestParam int adminId) {
		return adminService.deleteAdmin(adminId);
	}
}
