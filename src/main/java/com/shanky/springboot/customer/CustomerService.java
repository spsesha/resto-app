package com.shanky.springboot.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Customer getCustomer(Integer id) {
		return customerRepository.findOne(id);
	}

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	public void updateCustomer(Integer id, Customer item) {
		customerRepository.save(item);
		
	}

	public void deleteCustomer(Integer id) {
		customerRepository.delete(id);
		
	}
	
}
