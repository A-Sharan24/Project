package com.example.bookmanagementsystem.service;


import java.util.List;

import com.example.bookmanagementsystem.entity.Book;

public interface BookService {

	List<Book> getAllByOrderByBookName();

	Book findAllByBookId(int id) throws Exception;

	List<Book> getAllByOrderByPrice();

	List<Book> getAllByOrderByPages();

	List<Book> getAllByOrderByStock();

}
