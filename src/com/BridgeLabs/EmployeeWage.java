package com.BridgeLabs;

public class EmployeeWage {
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_DAY_HOUR = 4;
	static int WorkedHours=0;
	public static void main(String[] args) {

		int employeeMOnthlySalary=0;		
		int dailyWage = 0;
		int Day=1;
		System.out.println("Welcome to Employee Wage");
		int employeeCheck = (int) (Math.random() * 10) % 2;
		System.out.println(employeeCheck);
		
		if (employeeCheck == 1) {
			System.out.println("Employee is Present");
			dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
		}
		else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Daily wage => " + dailyWage);

	}
}
