package com.cg.microservice.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.microservice.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
