package week5;

import java.util.Scanner;

public class FormatFirstLastNames {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		
		String f = scan.next();  // CYBERTEK
		f = f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase();
		
		/*
		String f = scan.next().toUpperCase();
		f = f.charAt(0) + f.substring(1).toLowerCase();
		*/
		
		System.out.println("Enter your last name");
		String l = scan.next();
		scan.close();
		l = l.substring(0,1).toUpperCase() +l.substring(1).toLowerCase();
		
		String fullName = f +" "+l;
		String initial = ""+f.charAt(0) + l.charAt(0);
		//					"C"    +    'S';
							
		System.out.println("Full Name: "+fullName);
		System.out.println("Initial: "+initial);
		
		
		
		
	}
}
