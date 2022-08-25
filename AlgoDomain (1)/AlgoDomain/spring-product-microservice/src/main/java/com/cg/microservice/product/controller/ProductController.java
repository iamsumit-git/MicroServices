package com.cg.microservice.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.microservice.product.entity.Product;
import com.cg.microservice.product.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	public IProductService productSer;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product newProduct) {
		return productSer.addProduct(newProduct);
	}
	
	@GetMapping("/productList")
	public List<Product> getAllProduct(){
		return productSer.getAllProduct();
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable("id") Long productId){
		return productSer.getProductById(productId);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") Long productId) {
		productSer.deleteProduct(productId);
	}
	
	@PutMapping("/updateproduct/{id}")
	public Product updateProduct(@PathVariable("id") Long productId,@RequestBody Product updateProduct) {
		Optional<Product> product = getProductById(productId);
		Product oldProduct = product.get();
		if(product.isPresent()) {
			oldProduct.setProductprice(updateProduct.getProductprice());
			oldProduct.setProductName(updateProduct.getProductName());
			oldProduct.setProductCategoty(updateProduct.getProductCategoty());
			oldProduct.setProductType(updateProduct.getProductType());
		}else {
			System.out.println("Product not found");
		}
		return productSer.updateProduct(oldProduct);
	}
}
