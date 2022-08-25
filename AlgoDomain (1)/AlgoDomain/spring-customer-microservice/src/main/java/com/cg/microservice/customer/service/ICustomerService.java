package com.cg.microservice.customer.service;

import java.util.List;
import java.util.Optional;

import com.cg.microservice.customer.entity.Customer;

public interface ICustomerService {

	public Customer insertCustomer(Customer newCustomer);
	
	public List<Customer> getAllCustomer();
	
	public Optional<Customer> getCustomer(Long customerId);
	
	public void deleteCustomer(Long customerId);

}
