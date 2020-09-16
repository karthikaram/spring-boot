package io.workshop.model;

import java.util.Date;

// lombok
public class Employee {

	private Integer id;
	private String name;
	private Date birthDate;
	
	public Employee() {
		super();
	}

	public Employee(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, birthDate=%s]", id, name, birthDate);
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	
	
	
	
	
}
