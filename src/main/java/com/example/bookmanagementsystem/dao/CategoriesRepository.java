package com.example.bookmanagementsystem.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.bookmanagementsystem.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
	
	Optional<Categories> findById(int id);
	
	Categories findByName(String name);

}
