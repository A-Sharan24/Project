package com.example.bookmanagementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmanagementsystem.entity.Order;
import com.example.bookmanagementsystem.entity.User;
import com.example.bookmanagementsystem.service.OrderService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/orders")
public class OrderRestController {
	
	@Autowired
	OrderService orderServ;
	
	@GetMapping("/findByUserId/{id}")
	List<Order> findByUserId(@PathVariable int id)
	{
		return orderServ.findByUserId(id);
	}

}
