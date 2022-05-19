package com.mindgate.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")
public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	@Autowired
	private Address homeAddress;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String name, double salary, Address homeAddress) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", homeAddress="
				+ homeAddress + "]";
	}
	
	
	
}
