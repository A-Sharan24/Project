package com.example.bookmanagementsystem.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmanagementsystem.dao.BookRepository;
import com.example.bookmanagementsystem.entity.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> getAllByOrderByBookName() {
		// TODO Auto-generated method stub
		return bookRepository.getAllByOrderByName();
	}

	@Override
	public Book findAllByBookId(int id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Book> result = bookRepository.findById(id);
		
		Book theBook=null;
		try {
			if(result.isPresent())
			{
				theBook = result.get();
			}
			else {
				throw new Exception("Book id not found : "+id);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return theBook;
	}

	@Override
	public List<Book> getAllByOrderByPrice() {
		// TODO Auto-generated method stub
		return bookRepository.findAllByOrderByPrice();
	}

	@Override
	public List<Book> getAllByOrderByPages() {
		// TODO Auto-generated method stub
		return bookRepository.getAllByOrderByPages();
	}

	@Override
	public List<Book> getAllByOrderByStock() {
		// TODO Auto-generated method stub
		return bookRepository.getAllByOrderByStock();
	}
	
	



}
