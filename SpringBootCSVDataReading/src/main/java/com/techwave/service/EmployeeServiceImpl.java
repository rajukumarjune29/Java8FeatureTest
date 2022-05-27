package com.techwave.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwave.model.Employee;
import com.techwave.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	@Override
	public List<Employee> fetchEmployee() {
		
		return employeeRepo.findAll();
	}
	@Override
	public List<Employee> fetchEmployeesGreaterThanOrEqualTo(Float salary) {
		
		return fetchEmployee()
		.stream().filter(emp->emp.getEmpSalary()>=salary)
		.collect(Collectors.toList());
		
	}
	@Override
	public List<Employee> fetchEmployeesSalaryBetween(Float minSalary, Float maxSalary) {
		// TODO Auto-generated method stub
		return fetchEmployee()
				.stream().filter(emp-> emp.getEmpSalary()>=minSalary && emp.getEmpSalary()<maxSalary)
				.collect(Collectors.toList());
	}
	@Override
	public List<Employee> fetchEmployeeByQuarter(String quarter) {
		
		return fetchEmployee()
				.stream().filter(emp->emp.getEmpQuarterOfJoining().equals(quarter))
				.collect(Collectors.toList());
	}
	@Override
	public List<String> fetchEmailsSalaryGraterThan(Float salary) {
		
		return fetchEmployee()
				.stream().filter(emp->emp.getEmpSalary()>salary)
				.map(emp->emp.getEmpEmail())
				.collect(Collectors.toList());
	}
	@Override
	public List<Employee> deleteByEmpId(Integer empId) {
		// TODO Auto-generated method stub
		return fetchEmployee()
				.stream().filter(emp->emp.getEmp_ID().equals(empId)==false).collect(Collectors.toList());
	}
	
	

}
