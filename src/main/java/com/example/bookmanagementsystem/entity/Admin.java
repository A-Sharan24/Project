package com.example.bookmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name ="admin")
public class Admin {

	
	@Id
	@GeneratedValue(generator = "adminid", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "adminid", initialValue = 1000)
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="admin_username")
	@NotNull
	private String adminName;
	
	@Column(name="admin_password")
	@NotNull
	@Size(min=8,message="Password Must Contain 8 Characters")
	private int adminPassword;

	
	public Admin() {
		super();
	}


	public Admin(int adminId, @NotNull String adminName,
			@NotNull @Size(min = 8, message = "Password Must Contain 8 Characters") int adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public int getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(int adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
	

	
}
