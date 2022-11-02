package com.Springrest.Springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springrest.Springrest.entities.Employee;
import com.Springrest.Springrest.service.EmployeeService;

@RestController
public class Mycontroller {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String home() {
		return "welcome to home";
	}
	
//	get the courses
	
	@GetMapping("/employee")
	public List<Employee> getEmp() {
		return this.employeeService.getEmployee();
	}
	
}
