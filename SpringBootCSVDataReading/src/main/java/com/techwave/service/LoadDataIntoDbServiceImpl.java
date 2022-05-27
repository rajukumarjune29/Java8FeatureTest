package com.techwave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwave.model.Employee;
import com.techwave.repository.EmployeeRepo;

@Service
public class LoadDataIntoDbServiceImpl {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void loadEmployee(List<Employee> list){
		employeeRepo.saveAll(list);
	}
	
}
