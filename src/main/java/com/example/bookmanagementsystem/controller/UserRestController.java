package com.example.bookmanagementsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmanagementsystem.entity.Admin;
import com.example.bookmanagementsystem.entity.User;
import com.example.bookmanagementsystem.service.UserService;



@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	UserService userServ;
	
	@PostMapping("/register")
	public User saveUser(@Valid @RequestBody User theUser) throws Exception {

		 return userServ.saveUser(theUser);
	}
	
	@GetMapping("/finduser/{name}/{password}")
	public User findUserBynameAndPassword(@PathVariable String name,@PathVariable String password)
	{
		return userServ.findUserBynameAndPassword(name,password);
	}
	
	@GetMapping("/findAllByUserId/{id}")
	public User findAllByUserId(@PathVariable int id){
		return userServ.findById(id);
	}

}