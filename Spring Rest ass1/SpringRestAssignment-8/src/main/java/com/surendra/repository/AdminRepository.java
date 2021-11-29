package com.surendra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.surendra.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
