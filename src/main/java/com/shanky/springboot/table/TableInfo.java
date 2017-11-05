package com.shanky.springboot.table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_info")
public class TableInfo 
{
	@Id
	private int id;	
	private String description;
	private double people_count; 
	
	//EMPTY CONSTRUCTOR 
	public TableInfo(){
		
	}
	
	//CONSTRUCTOR WITH PARAMS
	
	public TableInfo(int id, String description, double people_count) {
		super();
		this.id = id;
		this.description = description;
		this.people_count = people_count;
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

	public double getPeople_count() {
		return people_count;
	}

	public void setPeople_count(double people_count) {
		this.people_count = people_count;
	}
	
	
	
	

}
