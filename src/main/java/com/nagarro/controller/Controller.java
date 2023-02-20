package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.entity.Employee;
import com.nagarro.repository.EmployeeRepo;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("/Employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
		
	}
	@GetMapping("/Employee")
	public List<Employee> getEmployee(){
		return employeeRepo.findAll();
	}
 
}
