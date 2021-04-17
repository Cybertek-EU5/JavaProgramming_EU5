package week4;

import utilities.StringUtility;

public class StringReverse {
	
	
	public static void main(String[] args) {
		
		String name = "Java";
		//			   0123
		
		String reverse = "";  // "avaJ"
		
		reverse += name.charAt(name.length()-1);  //a
		reverse += name.charAt(2); //v
		reverse += name.charAt(1); //a
		reverse += name.charAt(0); //J
		
		System.out.println(reverse);
		
		System.out.println("--------------------------");
		
		String str = "Java Programming Language Is Awesome Language";
		String result = "";
		
		for(int i = str.length()-1;  i >= 0; i-- ) { // i: represents the index numbers starting from last index to 0
			result += str.charAt(i);
		}
		
		System.out.println(result);
		
		System.out.println("-------------------------------");
		
		String schoolName = "Cybertek School";
		String reversedSchoolName = StringUtility.reverse(schoolName);
		
		System.out.println(reversedSchoolName);
		
		System.out.println("---------------------------------");
		
		String jobTitle = "Automation Engineer";
		String reversedJobTitle = StringUtility.reverse(jobTitle);
		
		System.out.println(reversedJobTitle);
		
		
		
		
		
		
		
		
		
	}
	

}
