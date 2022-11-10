package com.example.bookmanagementsystem.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="user_password")
	@NotNull
	@Size(min=8,message="Password Must Contain 8 Characters")
	private String password;
	
	@Column(name="first_name")
	@NotNull
	private String firstName;
	
	@Column(name="last_name")
	@NotNull
	private String lastName;
	
	@Column(name="phone_no")
	@Pattern(regexp = "^[0-9]{10}",message = "only 10 digits are allowed")
	private String phoneNo;
	
	@Column(name="email")
	@Email
	private String email;
	
	@Column(name="address")
	private String address;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Order> orders = new HashSet<>();

    public void add(Order order) {

        if (order != null) {

            if (orders == null) {
                orders = new HashSet<>();
            }

            orders.add(order);
            order.setUser(this);
        }
    }
    
    

	public User() {
		super();
	}



	public User(int id, String name,
			@NotNull @Size(min = 8, message = "Password Must Contain 8 Characters") String password,
			@NotNull String firstName, @NotNull String lastName,
			@Pattern(regexp = "^[0-9]{10}", message = "only 10 digits are allowed") String phoneNo, @Email String email,
			String address, Set<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.orders = orders;
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Set<Order> getOrders() {
		return orders;
	}



	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
    
    
	
	

	
}
