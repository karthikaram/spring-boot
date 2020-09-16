package io.workshop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.workshop.config.ApplicationConfig;
import io.workshop.services.EmployeeService;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext spring_container = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		EmployeeService employeeService = new EmployeeServiceImpl();
		EmployeeService employeeService = spring_container.getBean("employeeService",EmployeeService.class);
		
		employeeService.findAll().forEach(e -> System.out.println(e));

	}

}
