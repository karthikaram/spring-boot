package io.workshop.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.workshop.model.Employee;

public class CollectionEmployeeRepositoryImpl implements EmployeeRepository {
	
	private static List<Employee> employees = new ArrayList<>();
	
	static {
		employees.add(new Employee(101, "Vinodh", new Date()));
		employees.add(new Employee(102, "Kumar", new Date()));
		employees.add(new Employee(103, "Mahendra", new Date()));
	}

	@Override
	public List<Employee> findAll() {
		return employees;
	}

}
