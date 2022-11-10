package com.example.bookmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmanagementsystem.entity.Categories;
import com.example.bookmanagementsystem.service.CategoriesService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/categories")
public class CategoriesRestController {
	
	@Autowired
	CategoriesService categoriesServ;
	
	@GetMapping("/findById/{id}")
	public Categories findById(@PathVariable int id)
	{
		return categoriesServ.findById(id);
	}
	
	@GetMapping("/findByName/{name}")
	public Categories findByName(@PathVariable String name)
	{
		return categoriesServ.findByName(name);
	}

}
