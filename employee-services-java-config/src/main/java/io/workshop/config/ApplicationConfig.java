package io.workshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import io.workshop.repository.CollectionEmployeeRepositoryImpl;
import io.workshop.repository.EmployeeRepository;
import io.workshop.services.EmployeeService;
import io.workshop.services.EmployeeServiceImpl;

@Configuration
//@Import(value = "")
public class ApplicationConfig {
	
	// it makes this method as factory method
	// singleton instance
	@Bean
	public EmployeeRepository employeeRepository() {
		return new CollectionEmployeeRepositoryImpl();
	}

	
	@Bean
	public EmployeeService employeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		employeeService.setEmployeeRepository(employeeRepository());
		return employeeService;
	}
}
