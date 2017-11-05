package com.shanky.springboot.orderdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderDetailsController {
	
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@RequestMapping("/orderdetails")
	public List<OrderDetails> getAllOrderDetails(){
		return orderDetailsService.getAllOrderDetails();
	}
	
	@RequestMapping("/orderdetails/{id}")
	public OrderDetails getOrderDetail(@PathVariable Integer id){
		return orderDetailsService.getOrderDetail(id);		
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/orderdetails")
	public void addOrderDetail(@RequestBody OrderDetails orderDetails) {
		orderDetailsService.addOrderDetail(orderDetails);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/orderdetails/{id}")
	public void updateTable(@RequestBody OrderDetails orderDetails, @PathVariable Integer id)
	{
		orderDetailsService.updateOrderDetail(id, orderDetails);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/orderdetails/{id}")
	public void deleteTable(@PathVariable Integer id)
	{
		orderDetailsService.deleteOrderDetail(id);
	}

}
