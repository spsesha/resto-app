package com.shanky.springboot.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class OrderInfo 
{
	@Id
	private int id;		
	private Date date; 
	
	//EMPTY CONSTRUCTOR 
	public OrderInfo(){
		
	}

	
	
	//CONSTRUCTOR WITH PARAMS
	
	public OrderInfo(int id, Date date) {
		super();
		this.id = id;		
		this.date = date;
	}




	// GETTERS AND SETTERS
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}


}
