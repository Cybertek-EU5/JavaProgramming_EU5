package day25_arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		
		//This program stores in an array the hours worked for by 5 employees who all make the same hourly wage
		//display their gross pay
		
		final int EMPLOYEES = 5;
		double payRate;
		double grossPay;
		
		//Create a scanner object for input
		Scanner sc  = new Scanner(System.in);
		
		//create any array to hold employee hours
		int[] hours = new int[EMPLOYEES];
		
		//Get the hours worked by each employee
		System.out.println("Enter the hours worked by " + EMPLOYEES  + " employees who all earn the same hourly wage");
		
		for(int i=0;i<EMPLOYEES;i++) {
			hours[i] = sc.nextInt();
		}
		
		//Get the hourly pay rate
		System.out.print("Enter the hourly rate for each employee:");
		payRate = sc.nextDouble();
		
		
		//Display each employee's gross pay
		for(int i=0;i<EMPLOYEES;i++) {
			
			grossPay = hours[i]*payRate;
			
			System.out.println("Employee #" + (i+1) + ": $ " + grossPay);
			
		}
		
		
		
		
		
		
		
	}

}
