package com.example.bookmanagementsystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.bookmanagementsystem.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> getAllByOrderByName();
	
	//List<Book> findAllByBookId(int id);
	
	List<Book> findAllByOrderByPrice();
	
	List<Book> getAllByOrderByPages();
	
	List<Book> getAllByOrderByStock();

}
