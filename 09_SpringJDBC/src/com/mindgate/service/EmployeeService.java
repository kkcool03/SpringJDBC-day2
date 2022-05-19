package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.dao.EmployeeDAOInterface;
import com.mindgate.pojo.Employee;

@Service("employeeService")
@Scope("prototype")
//@Service     ye bhi chalta hai
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	private EmployeeDAOInterface daoInterface;
	
	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("inside EmployeeService addNewEmployee()");
		System.out.println(employee);
		return daoInterface.addNewEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return daoInterface.getAllEmployees();
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return daoInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return daoInterface.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return daoInterface.deleteEmployeeByEmployeeId(employeeId);
	}
	
}
