package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.repo.EmpRepo;
import com.example.demo.services.EmployeeServices;

@RestController
//@RequestMapping("/home")
public class Controller {
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("/")
	public String home()
	{
		return "Welcome";
	}
	
	@GetMapping("/emplist")
	public List<Employee> getEmployee() {
		
		
		return employeeServices.findAllEmployee();
	}
	@PostMapping(path="/newEmp", consumes = "application/json")
	public String newEmp(@RequestBody Employee emp)
	{
		Employee i=employeeServices.saveEmployee(emp);
		return "Resource Created:: "+i.getId();
	}
	

}
