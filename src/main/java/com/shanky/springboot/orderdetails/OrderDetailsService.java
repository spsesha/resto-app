package com.shanky.springboot.orderdetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsService {

	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	public List<OrderDetails> getAllOrderDetails(){
		List<OrderDetails> orderDetails = new ArrayList<>();
		orderDetailsRepository.findAll().forEach(orderDetails::add);
		return orderDetails;
	}

	public OrderDetails getOrderDetail(Integer id) {
		return orderDetailsRepository.findOne(id);
	}

	public void addOrderDetail(OrderDetails orderDetails) {
		orderDetailsRepository.save(orderDetails);
		
	}

	public void updateOrderDetail(Integer id, OrderDetails orderDetails) {
		orderDetailsRepository.save(orderDetails);
		
	}

	public void deleteOrderDetail(Integer id) {
		orderDetailsRepository.delete(id);
		
	}
	
}
