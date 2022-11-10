package com.example.bookmanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmanagementsystem.dao.CategoriesRepository;
import com.example.bookmanagementsystem.entity.Admin;
import com.example.bookmanagementsystem.entity.Categories;

@Service
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	CategoriesRepository categoriesRepository;

	@Override
	public Categories findById(int id) {
		// TODO Auto-generated method stub
		
	Optional<Categories> result = categoriesRepository.findById(id);
		
		Categories theCategories=null;
		try {
			if(result.isPresent())
			{
				theCategories = result.get();
			}
			else {
				throw new Exception("Categories id not found : "+id);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return theCategories;
	}

	@Override
	public Categories findByName(String name) {
		// TODO Auto-generated method stub
		return categoriesRepository.findByName(name);
	}
	
	
}
