package com.shanky.springboot.orderdetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetails 
{
	@Id
	private int id;
	private int table_id;
	private int item_id;
	private int item_quandity;		 
	
	//EMPTY CONSTRUCTOR 
	public OrderDetails(){
		
	}
	
	//CONSTRUCTOR WITH PARAMS
	
	
	public OrderDetails(int id, int table_id, int item_id, int item_quandity) {
		super();
		this.id = id;
		this.table_id = table_id;
		this.item_id = item_id;
		this.item_quandity = item_quandity;
	}
	
	// GETTERS AND SETTERS

	public int getOrderId() {
		return id;
	}	

	public void setOrderId(int id) {
		this.id = id;
	}

	public int getTableId() {
		return table_id;
	}

	public void setTableId(int tableId) {
		this.table_id = tableId;
	}

	public int getItemId() {
		return item_id;
	}

	public void setItemId(int itemId) {
		this.item_id = itemId;
	}

	public int getItemQuandity() {
		return item_quandity;
	}

	public void setItemQuandity(int itemQuandity) {
		this.item_quandity = itemQuandity;
	}

}
