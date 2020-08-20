package com;

public class MainEmpWageTest {

	public static void main(String[] args) {
		EmployeeWageImpl empWageBulider = new EmployeeWageImpl();
		
		empWageBulider.addCpmpanyEmpWage("Google", 250, 5, 100);
		empWageBulider.addCpmpanyEmpWage("Microsoft", 150, 5, 100);
		empWageBulider.addCpmpanyEmpWage("Dmart", 350, 5, 100);
		empWageBulider.addCpmpanyEmpWage("Infosys", 350, 5, 100);
		empWageBulider.addCpmpanyEmpWage("Tcs", 350, 5, 100);
		
		empWageBulider.computeEmpWAge();
		System.out.println("Total Wage " + empWageBulider.getTotalEmpWage("Google"));
		System.out.println();
	}

}
		






