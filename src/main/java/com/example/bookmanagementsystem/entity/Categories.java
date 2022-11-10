package com.example.bookmanagementsystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categories")
public class Categories {

	@Id
	@Column(name="category_id")
	private int id;
	
	@Column(name="category_name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categories")
    private Set<Book> books;

	
	
	public Categories() {
		super();
	}

	public Categories(int id, String name, Set<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

		
}
