package com.shanky.springboot.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/order")
	public List<OrderInfo> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@RequestMapping("/order/{id}")
	public OrderInfo getorder(@PathVariable Integer id){
		return orderService.getOrder(id);		
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/order")
	public void addOrder(@RequestBody OrderInfo order) {
		orderService.addOrder(order);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/order/{id}")
	public void updateOrder(@RequestBody OrderInfo order, @PathVariable Integer id)
	{
		orderService.updateOrder(id, order);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/order/{id}")
	public void deleteOrder(@PathVariable Integer id)
	{
		orderService.deleteOrder(id);
	}

}
