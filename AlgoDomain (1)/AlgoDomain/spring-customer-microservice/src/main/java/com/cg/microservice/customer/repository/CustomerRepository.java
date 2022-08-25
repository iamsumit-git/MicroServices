package com.cg.microservice.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.microservice.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
