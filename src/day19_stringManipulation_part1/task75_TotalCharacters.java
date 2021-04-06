package day19_stringManipulation_part1;

import java.util.Scanner;

public class task75_TotalCharacters {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter your first name:");  
		String firstName = sc.next();
		
		System.out.print("Enter your last name:");
		String lastName = sc.next();
		
		System.out.println("Total characters in your first and last name is:" +((firstName.length())+lastName.length()) );
		
		
		
		

	}

}
