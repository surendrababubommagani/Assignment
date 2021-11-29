package com.surendra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.surendra.model.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}
