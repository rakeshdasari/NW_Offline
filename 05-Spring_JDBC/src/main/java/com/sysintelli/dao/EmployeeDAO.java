package com.sysintelli.dao;

import java.util.List;

import javax.sql.DataSource;

import com.sysintelli.entity.Employee;

public class EmployeeDAO {

	private DataSource datsSource;

	public DataSource getDatsSource() {
		return datsSource;
	}

	public void setDatsSource(DataSource datsSource) {
		this.datsSource = datsSource;
	}

	public void addEmployee(Employee emp) {

	}

	public void deleteEmployeeByID(int empID) {

	}

	public Employee getEmployeeByID(int empID) {
		// --------------------
		return null;
	}

	public List<Employee> getAllEmployees() {
		return null;
	}

}
