package com.mindgate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "XYZ", 100);
		
		
		
		ApplicationContext applicationContext = 
					new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		EmployeeServiceInterface employeeServiceInterface =
		applicationContext.getBean("employeeService", EmployeeService.class);
		
//		boolean result = employeeServiceInterface.addNewEmployee(employee);
//		
//		if(result) {
//			System.out.println("Employee added successfully");
//		}
//		else {
//			System.out.println("Failed Successfully");
//		}
//		List<Employee> allEmployees = employeeServiceInterface.getAllEmployees();
//		
//		for (Employee eMployee2 : allEmployees) {
//			System.out.println(eMployee2);
//		}
//		
//		System.out.println("-".repeat(34));
//		
//		Employee employee2 = employeeServiceInterface.getEmployeeByEmployeeId(3);
//		System.out.println(employee2);
//		
//		System.out.println("-".repeat(34));
//		
//		boolean employee3 = employeeServiceInterface.updateEmployee(employee);
		
		Employee emp = new Employee(2, "Sprin JDBC", 2000);
		boolean result = employeeServiceInterface.updateEmployee(emp);
		System.out.println(result);
		if(result) {
			System.out.println("Employee added successfully");
		}
		else {
			System.out.println("Failed updated !!");
		}
		
		boolean result2 = employeeServiceInterface.deleteEmployeeByEmployeeId(44);
		if(result2) {
			System.out.println("Employee added successfully");
		}
		else {
			System.out.println("Failed deleted !!!");
		}
		
	}
}
