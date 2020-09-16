package io.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.workshop.model.Employee;
import io.workshop.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(path = "/employees", method = RequestMethod.GET)
	public List<Employee> retriveAllEmployees(){
		return employeeRepository.findAll();
	}
}
