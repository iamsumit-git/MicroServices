package com.cg.microservice.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.microservice.product.entity.Product;
import com.cg.microservice.product.repository.ProductRepository;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	public ProductRepository productRepo;

	@Override
	public Product addProduct(Product newProduct) {
		// TODO Auto-generated method stub
		return productRepo.save(newProduct);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}



	@Override
	public void deleteProduct(Long productId) {
		// TODO Auto-generated method stub

		productRepo.deleteById(productId);
	}

	@Override
	public Product updateProduct(Product updateProduct) {
		// TODO Auto-generated method stub
		return productRepo.save(updateProduct);
	}

	@Override
	public Optional<Product> getProductById(Long productId) {
		// TODO Auto-generated method stub
		return productRepo.findById(productId);
	}
	

}
