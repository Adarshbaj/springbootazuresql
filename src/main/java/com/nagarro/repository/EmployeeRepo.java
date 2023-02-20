package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.entity.Employee;


public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
