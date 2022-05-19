package com.mindgate.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.pojo.Employee;
import com.mindgate.rowmapper.EmployeeRowMapper;

@Repository
@Scope("prototype")
public class EmployeeDAO implements EmployeeDAOInterface {

	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_EMPLOYEE = "insert into employe"
			+ "_details(name,salary) values(?,?)";
	private static final String SELECT_ALL_EMPLOYEES = "select * from employe_details";
	private static final String SELECT_SINGLE_EMPLOYEE = "select * from employe_details where employee_id = ?";
	private static final String UPDATE_EMPLOYEE = "update employe_details set name = ?, salary = ? where employee_id = ?";
	private static final String DELETE_EMPLOYEE = "delete employe_details where employee_id = ?";

	
	public EmployeeDAO() {
	}

	@Autowired
	public EmployeeDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("inserting new employee into database");
		System.out.println(employee);
		
		Object [] args = {employee.getName(),employee.getSalary()};
		int resulCount = jdbcTemplate.update(INSERT_EMPLOYEE, args);
		
		if(resulCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployes = jdbcTemplate.query(SELECT_ALL_EMPLOYEES, new EmployeeRowMapper());
		return allEmployes;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		Object[] args = {employeeId};
		Employee employee = jdbcTemplate.queryForObject(SELECT_SINGLE_EMPLOYEE, args, new EmployeeRowMapper());
		return employee;
	}

	@Override
	public boolean updateEmployee(Employee employee) {

		Object [] args = {employee.getName(),employee.getSalary(),employee.getEmployeeId()};
		int resulCount = jdbcTemplate.update(UPDATE_EMPLOYEE, args);
		
		if(resulCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {

		Object [] args = {employeeId};
		int resulCount = jdbcTemplate.update(DELETE_EMPLOYEE, args);
		
		if(resulCount > 0)
			return true;
		else
			return false;
	}

}
