package com.example.bookmanagementsystem.service;

import java.util.List;

import com.example.bookmanagementsystem.entity.Admin;

public interface AdminService {

	List<Admin> findByAdminNameAndPassword(String adminName, int password);

	Admin findAllByAdminId(int id);

}
