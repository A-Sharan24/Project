package com.example.bookmanagementsystem.service;

import java.util.List;

import javax.validation.Valid;

import com.example.bookmanagementsystem.entity.User;

public interface UserService {

	User findUserBynameAndPassword(String name,String password);
	
	User findById(int id);

	User saveUser(@Valid User theUser) throws Exception;
}
