package com.cg.microservice.seller.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.microservice.seller.api.entity.Product;
import com.cg.microservice.seller.api.entity.Seller;
import com.cg.microservice.seller.api.service.ISellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private ISellerService sellerService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/addproduct")
	public Product addProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product newProduct = new Product(1L,"Oppo","SmartPhone","NewGeration",20000f);
		Product createProduct = restTemplate.postForObject("http://localhost:9090/product/addProduct", newProduct, Product.class);
		return createProduct;
	}
	
	
	@PostMapping("/addSeller")
	public Seller addSeller(@RequestBody Seller newSeller) {
		return sellerService.addSeller(newSeller);
	}
	
	@GetMapping("/sellet/{id}")
	public Optional<Seller> getSellerById(@PathVariable("id") Long sellerId){
		return sellerService.getSeller(sellerId);
	}
	
	
	
}
