package com.example.bookmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(generator = "bookid", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "bookid", initialValue = 1140)
	@Column(name="book_id")
	private int id;
	
	@Column(name="book_name")
	@NotNull
	private String name;
	
	@Column(name="author_name")
	@NotNull
	private String authorName;
	
	@Column(name="book_price")
	@NotNull
	private double price;
	
	@Column(name="publication")
	@NotNull
	private String publication;
	
	@Column(name="books_in_stock")
	@NotNull
	private int stock;
	
	@Column(name="no_of_pages")
	@NotNull
	private int pages;
	
	@ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Categories categories;
	
	

	public Book() {
		super();
	}

	public Book(int id, @NotNull String name, @NotNull String authorName, @NotNull double price,
			@NotNull String publication, @NotNull int stock, @NotNull int pages, Categories categories) {
		super();
		this.id = id;
		this.name = name;
		this.authorName = authorName;
		this.price = price;
		this.publication = publication;
		this.stock = stock;
		this.pages = pages;
		this.categories = categories;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	
}
