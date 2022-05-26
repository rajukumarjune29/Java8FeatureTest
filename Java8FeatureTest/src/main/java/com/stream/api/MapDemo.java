package com.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Employee{
	
	private Integer empId;
	private String empName;
	private Float empSalary;
	
	public Employee() {
		
	}
	public Employee(Integer empId, String empName, Float empSalary){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
public class MapDemo {

	public static void main(String args[]) {
		
		HashMap<Integer,Employee> map=new HashMap<Integer, Employee>();
		
		Employee e1=new Employee(100,"Raju Kumar", 5000.0F);
		Employee e2=new Employee(101,"Seema", 200.0F);
		Employee e3=new Employee(102,"Sushma Kumari", 100.0F);
		Employee e4=new Employee(11,"Sudama Sahu", 5000.0F);
		Employee e5=new Employee(22,"Ram", 3000.0F);
		Employee e6=new Employee(23,"Sohan Kumar", 200.0F);
		
		map.put(e1.getEmpId(),e1);
		map.put(e2.getEmpId(),e2);
		map.put(e3.getEmpId(),e3);
		map.put(e4.getEmpId(),e4);
		map.put(e5.getEmpId(),e5);
		map.put(e6.getEmpId(),e6);
		
		
		System.out.println(map);
		
		List<Map.Entry<Integer,Employee>> list=new ArrayList<Map.Entry<Integer,Employee>>(map.entrySet());
		
		Collections.sort(list,(m1,m2)->m1.getValue().getEmpSalary().compareTo(m2.getValue().getEmpSalary()));
		
		LinkedHashMap<Integer, Employee> lmap=new LinkedHashMap<Integer, Employee>(list.size());
		for(Map.Entry<Integer, Employee> m:list) {
			lmap.put(m.getKey(), m.getValue());
		}
		System.out.println(lmap);
		System.out.println(map.entrySet().stream().collect(Collectors.groupingBy(e->e.getValue().getEmpSalary())));
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		System.out.println(empList);
		
		Map m1=empList.stream().collect(Collectors.groupingBy(e->e.getEmpSalary()));
		
		System.out.println(m1);
		System.out.println(empList.stream()
				.filter(e111->e111.getEmpSalary()>100.0F)
				.collect(Collectors.minBy((e11,e22)->e11.getEmpSalary().compareTo(e22.getEmpSalary()))));
	}
}
