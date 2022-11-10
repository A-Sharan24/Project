package com.example.bookmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmanagementsystem.dao.AdminRespository;
import com.example.bookmanagementsystem.entity.Admin;
import com.example.bookmanagementsystem.entity.Book;

@Service
public class AdminServiceImpl implements AdminService{

	
	@Autowired
	AdminRespository adminRespository;
	

	public AdminServiceImpl(AdminRespository adminRespository) {
		super();
		this.adminRespository = adminRespository;
	}

	@Override
	public List<Admin> findByAdminNameAndPassword(String adminName, int password) {
		// TODO Auto-generated method stub
		return adminRespository.findByAdminNameAndAdminPassword(adminName,password);
	}

	@Override
	public Admin findAllByAdminId(int id) {
		// TODO Auto-generated method stub
		Optional<Admin> result = adminRespository.findById(id);
		
		Admin theAdmin=null;
		try {
			if(result.isPresent())
			{
				theAdmin = result.get();
			}
			else {
				throw new Exception("Admin id not found : "+id);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return theAdmin;
	}
	
	
}
