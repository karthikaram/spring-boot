package io.workshop.repository;

import java.util.List;

import io.workshop.model.Employee;

public interface EmployeeRepository {
	
	List<Employee> findAll();

}
