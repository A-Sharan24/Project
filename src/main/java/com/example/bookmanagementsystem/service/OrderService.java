package com.example.bookmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.example.bookmanagementsystem.entity.Order;
import com.example.bookmanagementsystem.entity.User;

public interface OrderService {

	List<Order> findByUserId(int id);

}
