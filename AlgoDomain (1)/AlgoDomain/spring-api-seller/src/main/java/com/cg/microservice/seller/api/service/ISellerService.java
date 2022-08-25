package com.cg.microservice.seller.api.service;

import java.util.Optional;

import com.cg.microservice.seller.api.entity.Seller;

public interface ISellerService {

	public Seller addSeller(Seller newSeller);
	
	public Optional<Seller> getSeller(Long sellerId);
}
