package com.example.bookmanagementsystem.service;

import com.example.bookmanagementsystem.entity.Categories;

public interface CategoriesService {

	Categories findById(int id);

	Categories findByName(String name);

}
