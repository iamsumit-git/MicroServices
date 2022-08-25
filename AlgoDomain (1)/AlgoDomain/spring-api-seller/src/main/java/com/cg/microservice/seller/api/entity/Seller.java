package com.cg.microservice.seller.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Table(name = "seller")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Seller {

	@Id
	private Long sellerId;
	private String sellerName;
	private String address;
    
}
