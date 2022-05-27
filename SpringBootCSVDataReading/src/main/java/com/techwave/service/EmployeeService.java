package com.techwave.service;

import java.util.List;

import com.techwave.model.Employee;

public interface EmployeeService {
	
	public List<Employee> fetchEmployee();
	
	public List<Employee> fetchEmployeesGreaterThanOrEqualTo(Float salary);
	public List<Employee> fetchEmployeesSalaryBetween(Float minSalary,Float maxSalary);
	public List<Employee> fetchEmployeeByQuarter(String quarter);

	public List<String> fetchEmailsSalaryGraterThan(Float salary);

	public List<Employee> deleteByEmpId(Integer empId);
}
