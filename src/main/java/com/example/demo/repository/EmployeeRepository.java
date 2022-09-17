package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee getById(String uid);
}
