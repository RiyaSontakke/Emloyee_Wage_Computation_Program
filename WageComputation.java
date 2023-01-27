package com.bridgelabz.empwage;

public class WageComputation {
	private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private final String company;
    private final int EMP_RATE_PER_HRS ;
    private final int NUM_OF_WORKING_DAYS ;
    private final int MAX_HRS_IN_MONTH ;
    public WageComputation(String company, int EMP_RATE_PER_HRS, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
    	this.company = company;
    	this.EMP_RATE_PER_HRS = EMP_RATE_PER_HRS;
    	this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
    	this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH ;
    }
    private int computeEmpWage() {
    	int empHrs = 0, totalEmpHrs = 0,  totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
                break;
        }
           totalEmpHrs = (totalEmpHrs+empHrs);
           System.out.println("Days: " + totalWorkingDays + " Emp Hr: " + empHrs);
    }
        return totalEmpHrs* EMP_RATE_PER_HRS;
    }
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");	
		WageComputation dmart = new WageComputation("Dmart",100,26,30);
		System.out.println("Total Employee Wage for Company " + dmart.company + " is: " + dmart.computeEmpWage());
		WageComputation BigBasket = new WageComputation("BigBasket", 150, 23, 25);
		System.out.println("Total Employee Wage for Company " + BigBasket.company + " is: " + BigBasket.computeEmpWage());
    }
}
