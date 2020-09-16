package io.workshop.client;

import io.workshop.services.EmployeeService;
import io.workshop.services.EmployeeServiceImpl;

public class Program {

	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		employeeService.findAll().forEach(e -> System.out.println(e));

	}

}
