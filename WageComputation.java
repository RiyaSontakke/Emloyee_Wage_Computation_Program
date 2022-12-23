package com.bridgelabz.empwage;

public class WageComputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");
		int empHrs = 0;
		 int empWage = 0;
		 int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		
		    System.out.println(empCheck);
		
		switch (empCheck) {
		case IS_PART_TIME:
		
            System.out.println(empWage);
			empHrs = 4;
			break;
		
		case IS_FULL_TIME:		
			System.out.println(empWage);
		    empHrs = 8;
		    break;
		default :
		
			System.out.println(empWage);
			empHrs = 0;
		    break;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:" + empWage);		
		}
	}

	
		
	

