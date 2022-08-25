package com.cg.microservice.product.service;

import java.util.List;
import java.util.Optional;

import com.cg.microservice.product.entity.Product;

public interface IProductService {

	
	public Product addProduct(Product newProduct);
	
	public List<Product> getAllProduct();
	
	public Optional<Product> getProductById(Long productId);
	
	public void deleteProduct(Long productId);
	
	public Product updateProduct(Product updateProduct);
	
	
}
