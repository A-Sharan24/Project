package com.example.bookmanagementsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.bookmanagementsystem.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findByUserId(int id);
}
