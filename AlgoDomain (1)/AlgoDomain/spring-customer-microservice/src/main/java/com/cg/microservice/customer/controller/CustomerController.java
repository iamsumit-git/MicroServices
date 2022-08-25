package com.cg.microservice.customer.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.microservice.customer.entity.Customer;
import com.cg.microservice.customer.service.ICustomerService;


@RestController
@RequestMapping("/customer")
@RefreshScope
public class CustomerController {

	@Autowired
	public ICustomerService custService;
	

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/product/productList")
	public List<Object> getAllProduct(){
		
		RestTemplate restTemplate = new RestTemplate();
		Object[] objects =restTemplate.getForObject("http://localhost:9090/product/productList", Object[].class);
		List<Object> products = Arrays.asList(objects);
		return products;
	}
	
	//@GetMapping("/product/{name}")
	//public Object getProductByName() {
	//	RestTemplate restTemplate = new RestTemplate();
	//	Object object = restTemplate.get
	//}
	
	
		
	
	
	@PostMapping("/insertcustomer")
	public Customer insertCustomer(@RequestBody Customer newCustomer) {
		return custService.insertCustomer(newCustomer);
	}
	
	@GetMapping("/customerlist")
	public List<Customer> getAllCustomers(){
		return custService.getAllCustomer();
	}
	
	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomer(@PathVariable("id") Long cid){
		return custService.getCustomer(cid);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomer(@PathVariable("id") Long custid) {
		custService.deleteCustomer(custid);
	}
}
