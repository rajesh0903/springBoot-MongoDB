package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.repo.EmpRepo;

@Service
public class EmployeeServices {
	
	@Autowired
	private EmpRepo empRepo;

	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		return empRepo.save(emp);
	}

	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

}
