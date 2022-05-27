package com.techwave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techwave.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
