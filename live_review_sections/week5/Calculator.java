package week5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //  \n\n

		
		while(true) {
			System.out.println("Enter your first number");
			int f = scan.nextInt();  //10

			System.out.println("Enter your second number");
			int s = scan.nextInt();  //20

			System.out.println("Sum: " + (f + s));

			scan.nextLine(); // \n\n , TAKES EVERYTHING, INCLUDING ENTER 
			
			System.out.println("Do you want to continue?");
			String a = scan.nextLine().toLowerCase();
			
			while( ! (a.equals("yes") || a.equals("no")) ) { // if the answer is invalid
				System.out.println("Invalid Entry, pelase re-enter");
				 a = scan.nextLine().toLowerCase();
			}
			
			
			if(a.equals("no")) {
				System.out.println("Test Completed");
				break;
			}
			
		}
		
		
		
		

	}

}

/*
 * 4. write a program that ill ask user to enter two numbers and calculates the
 * sum of those two numbers. then it asks the user if he/she wants to continue
 * 
 * if the answer is yes, repeat the whole process again if the answer is no,
 * only return the addition
 * 
 * but WHILE the answer is neither yes nor no, the the program should repeatedly
 * ask the user re-enter
 * 
 * HINT: nested loop task, outter loop need to be an infinite loop
 */