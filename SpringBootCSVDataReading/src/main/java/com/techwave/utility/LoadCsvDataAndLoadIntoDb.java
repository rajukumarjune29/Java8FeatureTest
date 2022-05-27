package com.techwave.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.techwave.model.Employee;
import com.techwave.service.LoadDataIntoDbServiceImpl;



public class LoadCsvDataAndLoadIntoDb implements CommandLineRunner{

	@Autowired
	LoadDataIntoDbServiceImpl loadData;
	

	@Override
	public void run(String... args) throws Exception {
		
FileInputStream fileInputStream=new FileInputStream("C:\\Users\\HP\\Desktop\\records.csv");
		
		InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
		
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		
		//System.out.println(bufferedReader.lines().count());
		List<Employee> list=bufferedReader.lines().map(line->
		
		{
			String emps[]=line.split(",");
			
			Employee emp=new Employee();
		    emp.setEmpNamePrefix(emps[1]);
			emp.setEmpFirstName(emps[2]);
			emp.setEmpGender(emps[3]);
			emp.setEmpEmail(emps[4]);
			emp.setEmpAgeInYrs(Float.parseFloat(emps[5]));
			emp.setEmpWeightInKgs(Float.parseFloat(emps[6]));
			emp.setEmpQuarterOfJoining(emps[7]);
			emp.setEmpHalfOfJoining(emps[8]);
			emp.setEmpYearOfJoining(Integer.parseInt(emps[9]));
			emp.setEmpMonthOfJoining(Integer.parseInt(emps[10]));
			emp.setEmpAgeInCompanyInYears(Float.parseFloat(emps[11])); 
			emp.setEmpSalary(Float.parseFloat(emps[12]));
			emp.setEmpLastPercentHike(Float.parseFloat(emps[13]));
			emp.setEmpCounty(emps[14]);
			emp.setEmpCity(emps[15]);
			emp.setEmpState(emps[16]);
			emp.setEmpZip(emps[17]);
			emp.setEmpRegion(emps[18]);
			return emp;
		}
				).collect(Collectors.toList());
		
		
		loadData.loadEmployee(list);
	}
	
	
}
