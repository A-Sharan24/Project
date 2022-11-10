package com.example.bookmanagementsystem.dao;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.bookmanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserBynameAndPassword(String name,String password);

	User findByName(String name);

	//User saveAll(@Valid User theUser)
	
}
