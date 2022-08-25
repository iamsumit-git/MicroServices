package com.cg.microservice.seller.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.microservice.seller.api.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller,Long> {

}
