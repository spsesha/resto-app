package com.shanky.springboot.restaurent;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant 
{
	@Id
	private int id;	
	private String name;
	private String address;
	private String phone;
	private String emailAddress;
	private String website;
	private Date createdAt;
	private int active;
	private int totalUsers; 
	
	//EMPTY CONSTRUCTOR 
	public Restaurant(){
		
	}

	
	//CONSTRUCTOR WITH PARAMS
	
	public Restaurant(int id, String name, String address, String phone, String emailAddress, String website,
			Date createdAt, int active, int totalUsers) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.emailAddress = emailAddress;
		this.website = website;
		this.createdAt = createdAt;
		this.active = active;
		this.totalUsers = totalUsers;
	}

	
	// GETTERS AND SETTERS

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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	public int getTotalUsers() {
		return totalUsers;
	}


	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}
	
	
	
	
	
	
	
	
	

}
