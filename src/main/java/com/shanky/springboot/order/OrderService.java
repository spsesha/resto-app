package com.shanky.springboot.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<OrderInfo> getAllOrders(){
		List<OrderInfo> orders = new ArrayList<>();
		orderRepository.findAll().forEach(orders::add);
		return orders;
	}

	public OrderInfo getOrder(Integer id) {
		return orderRepository.findOne(id);
	}

	public void addOrder(OrderInfo order) {
		orderRepository.save(order);
		
	}

	public void updateOrder(Integer id, OrderInfo order) {
		orderRepository.save(order);
		
	}

	public void deleteOrder(Integer id) {
		orderRepository.delete(id);		
	}
	
}
