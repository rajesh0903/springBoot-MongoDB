package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.Employee;

public interface EmpRepo extends MongoRepository<Employee, Integer> {

}
