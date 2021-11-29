package com.surendra.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.surendra.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
