package io.workshop.services;

import java.util.List;

import io.workshop.model.Employee;
import io.workshop.repository.CollectionEmployeeRepositoryImpl;
import io.workshop.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{
	
	//depends on EmployeeRepository
	private EmployeeRepository employeeRepository ;
	
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		// logging , security
		return employeeRepository.findAll();
	}

}
