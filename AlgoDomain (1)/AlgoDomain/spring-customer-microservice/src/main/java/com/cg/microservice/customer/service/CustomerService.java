package com.cg.microservice.customer.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.microservice.customer.entity.Customer;
import com.cg.microservice.customer.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	private CustomerRepository custRepo;

	@Override
	public Customer insertCustomer(Customer newCustomer) {
		// TODO Auto-generated method stub
		return custRepo.save(newCustomer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}

	@Override
	public Optional<Customer> getCustomer(Long customerId) {
		// TODO Auto-generated method stub
		return custRepo.findById(customerId);
	}

	@Override
	public void deleteCustomer(Long customerId) {
		// TODO Auto-generated method stub
		custRepo.deleteById(customerId);

	}

}
