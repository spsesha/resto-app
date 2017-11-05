package com.shanky.springboot.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService tableService;
	
	@RequestMapping("/customer")
	public List<Customer> getAllCustomers(){
		return tableService.getAllCustomers();
	}
	
	@RequestMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Integer id){
		return tableService.getCustomer(id);		
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/customer")
	public void addCustomer(@RequestBody Customer customer) {
		tableService.addCustomer(customer);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/customer/{id}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable Integer id)
	{
		tableService.updateCustomer(id, customer);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/customer/{id}")
	public void deleteCustomer(@PathVariable Integer id)
	{
		tableService.deleteCustomer(id);
	}

}
