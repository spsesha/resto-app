package com.shanky.springboot.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order_Info 
{
	@Id
	private int id;	
	private String description;
	private Date date; 
	
	//EMPTY CONSTRUCTOR 
	public Order_Info(){
		
	}

	
	
	//CONSTRUCTOR WITH PARAMS
	
	public Order_Info(int id, String description, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.date = date;
	}




	// GETTERS AND SETTERS
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}


}
