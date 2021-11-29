package com.surendra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.surendra.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Integer>{

}
