package week4;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Enter your employee ID");
		int id = scan.nextInt();  //11
	
		scan.nextLine(); // Enter
		
		System.out.println("Enter your full name:");
		String name = scan.nextLine();
		
		scan.close();
		
		
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		
		
		
	}
	
}
