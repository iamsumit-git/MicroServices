package com.cg.microservice.seller.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.microservice.seller.api.entity.Seller;
import com.cg.microservice.seller.api.repository.SellerRepository;

@Service
public class SellerService implements ISellerService {
	
	@Autowired
	private SellerRepository sellRep;

	@Override
	public Seller addSeller(Seller newSeller) {
		// TODO Auto-generated method stub
		return sellRep.save(newSeller);
	}

	@Override
	public Optional<Seller> getSeller(Long sellerId) {
		// TODO Auto-generated method stub
		return sellRep.findById(sellerId);
	}

}
