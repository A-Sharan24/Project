package com.example.bookmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmanagementsystem.entity.Book;
import com.example.bookmanagementsystem.service.BookService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/books")
public class BookRestController {

	@Autowired
	BookService bookServ;
	
	@GetMapping("/getAllByOrderByBookName")
	public List<Book> getAllByOrderByBookName(){
		return bookServ.getAllByOrderByBookName();
	}
	
	@GetMapping("/findAllByBookId/{bookId}")
	public Book findAllByBookId(@PathVariable int id) throws Exception{
		return bookServ.findAllByBookId(id);
	}
	
	@GetMapping("/getAllByOrderByPrice")
	public List<Book> getAllByOrderByPrice(){
		return bookServ.getAllByOrderByPrice();
	}
	
	@GetMapping("/getAllByOrderByPages")
	public List<Book> getAllByOrderByPages(){
		return bookServ.getAllByOrderByPages();
	}
	
	@GetMapping("/getAllByOrderByBooksInStock")
	public List<Book> getAllByOrderByBooksInStock(){
		return bookServ.getAllByOrderByStock();
	}
}
	
