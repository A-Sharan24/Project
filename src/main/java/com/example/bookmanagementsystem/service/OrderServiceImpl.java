package com.example.bookmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmanagementsystem.dao.OrderRepository;
import com.example.bookmanagementsystem.entity.Order;
import com.example.bookmanagementsystem.entity.User;

	@Service
	public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> findByUserId(int id) {
		// TODO Auto-generated method stub
		return orderRepository.findByUserId(id);
	}
}
