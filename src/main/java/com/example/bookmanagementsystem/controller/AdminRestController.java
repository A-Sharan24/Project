package com.example.bookmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmanagementsystem.entity.Admin;
import com.example.bookmanagementsystem.service.AdminService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminRestController {
	
	@Autowired
	AdminService adminServ;
	
	@GetMapping("/findByAdminNameAndPassword/{adminname}/{password}")
	public List<Admin> findUserByAdminNameAndPassword(@PathVariable String adminName,@PathVariable int password){
		return adminServ.findByAdminNameAndPassword(adminName, password);
	}
	
	@GetMapping("/findAllByUserId/{id}")
	public Admin findAllByAdminId(@PathVariable int id){
		return adminServ.findAllByAdminId(id);
	}

}
