package com.example.bookmanagementsystem.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="order_id")
	private int id;
	
	@Column(name="total_quantity")
	private int totalQuantity;

	@Column(name="total_price")
	private double totalPrice;
	
	@Column(name="date_booked")
	@CreationTimestamp
	private Date dateBooked;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	
	
	public Order() {
		super();
	}



	public Order(int id, int totalQuantity, double totalPrice, Date dateBooked, User user) {
		super();
		this.id = id;
		this.totalQuantity = totalQuantity;
		this.totalPrice = totalPrice;
		this.dateBooked = dateBooked;
		this.user = user;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getTotalQuantity() {
		return totalQuantity;
	}



	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}



	public double getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public Date getDateBooked() {
		return dateBooked;
	}



	public void setDateBooked(Date dateBooked) {
		this.dateBooked = dateBooked;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	

	
	
}
