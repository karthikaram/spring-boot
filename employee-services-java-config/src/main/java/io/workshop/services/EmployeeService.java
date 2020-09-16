package io.workshop.services;

import java.util.List;

import io.workshop.model.Employee;

public interface EmployeeService {
	List<Employee> findAll();
}
