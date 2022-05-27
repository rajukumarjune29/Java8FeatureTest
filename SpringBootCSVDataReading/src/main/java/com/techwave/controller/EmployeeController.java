package com.techwave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techwave.model.Employee;
import com.techwave.service.EmployeeService;

@RestController
@RequestMapping("/employee-module")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	@GetMapping("/employees")
	public ResponseEntity<?> getEmployees(){
		return new ResponseEntity<List<Employee>>(empService.fetchEmployee(),HttpStatus.OK);
	}
	
	@GetMapping("/employees/salary-graterthan/{salary}")
	public ResponseEntity<?> getEmployeeSalaryMoreThan(@PathVariable("salary") Float salary){
		return new ResponseEntity<List<Employee>>(empService.fetchEmployeesGreaterThanOrEqualTo(salary),HttpStatus.OK);
	}
	
	@GetMapping("/employees/salary-between/{minSalary}/and/{maxSalary}")
	public ResponseEntity<?> getEmployeesSalaryBetween(@PathVariable("minSalary") Float minSalary, 
			@PathVariable("maxSalary") Float maxSalary){
		return new ResponseEntity<List<Employee>>(empService.fetchEmployeesSalaryBetween(minSalary, maxSalary),HttpStatus.OK);
	}
	
	@GetMapping("/employees/quater/{quater}")
	public ResponseEntity<?> getEmployeesByQuater(@PathVariable("quater") String quater){
		return new ResponseEntity<List<Employee>>(empService.fetchEmployeeByQuarter(quater),HttpStatus.OK);
	}
	
	@GetMapping("/emails/salary-graterthan/{salary}")
	public ResponseEntity<List<String>> getEmailsSalrayMoreThan(@PathVariable("salary") Float salary){
		return new ResponseEntity<List<String>>(empService.fetchEmailsSalaryGraterThan(salary),HttpStatus.OK);
	}
	
	@GetMapping("/bhawani/{empId}")
	public ResponseEntity<?> deleteByEmpId(@PathVariable("empId") Integer empId){
		return new ResponseEntity<List<Employee>>(empService.deleteByEmpId(empId),HttpStatus.OK);
	}
}
