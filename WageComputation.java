package com.bridgelabz.empwage;

public class WageComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		// constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 1;
		int IS_FULL_TIME_ = 2 ;
		int EMP_RATE_PER_HOUR = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		// computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		System.out.println(empCheck);
		
		if(empcheck == IS_FULL_TIME) {
			
			if (empCheck == IS_PART_TIME)
				empHrs = 4;
		}
			else if (empCheck == IS_FULL_TIME_)
			{
				empHrs = 8;
			}
		
			else
				empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +empWage);
}
}
