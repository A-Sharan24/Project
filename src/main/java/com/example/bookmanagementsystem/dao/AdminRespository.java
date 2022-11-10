package com.example.bookmanagementsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.bookmanagementsystem.entity.Admin;
import com.example.bookmanagementsystem.entity.User;


public interface AdminRespository extends JpaRepository<Admin, Integer> {
	
	List<Admin> findByAdminNameAndAdminPassword(String adminName,int password);
	
	//List<Admin> findAllByAdminId(int id);

}
