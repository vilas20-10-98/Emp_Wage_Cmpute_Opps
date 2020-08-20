package com;

import java.util.ArrayList;

//pojo class
public class CompanyEmployeeWage {
	public String company;
	public int empRatePerHr;
	public int numberOfWorkingDays;
	public int maxHrPerMonth;
	public int totalEmpWage;
	ArrayList<Integer> dailyWage = new ArrayList<Integer>();
	
	//constructor
	public CompanyEmployeeWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth,
			int totalEmpWage, ArrayList<Integer> dailyWage) {
		super();
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxHrPerMonth = maxHrPerMonth;
		this.totalEmpWage = totalEmpWage;
		this.dailyWage = dailyWage;
	}

	
	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
		
	}


	@Override
	public String toString() {
		return "total Employee Wage for: "+ company +" IS " + totalEmpWage;
	}
}
		


	
	

	
	

