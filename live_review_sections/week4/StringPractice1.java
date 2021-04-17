package week4;

import java.util.Scanner;

public class StringPractice1 {
	
	
	public static void main(String[] args) {
		
		String str1 = "Java";   // literal
		String str2 = "Java";   // literal
		String str3 = "Java";   // literal
		
		// in string pool there is only one object "Java" being shared by str1, str2, str3
		
		System.out.println(str1 == str2); // true
		System.out.println(str2 == str3); // true
		System.out.println(str1 == str3); // true
		
		System.out.println("---------------------------------------");
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = new String("Java");
		
		// in heap, there are three objects of "Java" are created.
		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3); // false
		System.out.println(s3 == s1); // false
		
		System.out.println("------------------------------");
		
		System.out.println(s1 == str1); // false
		
		System.out.println("----------------------");
		String s4 = new Scanner(System.in).next();  //"Java"
		
		System.out.println(s4 == s1);  // false
		System.out.println(str1 == s4); // false
		
		
		
	}
	

}
