package com.techwave.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emp_ID;
	private String empNamePrefix;
	private String empFirstName;
	private String empGender;
	private String empEmail;
	private Float empAgeInYrs;
	private Float empWeightInKgs;
	private String empQuarterOfJoining;
	private String empHalfOfJoining;
	private Integer empYearOfJoining;
	private Integer empMonthOfJoining;
	private Float empAgeInCompanyInYears; 
	private Float empSalary;
	private Float empLastPercentHike;
	private String empCounty;
	private String empCity;
	private String empState;
	private String empZip;
	private String empRegion;

}
