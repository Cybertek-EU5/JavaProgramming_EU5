package week6;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Cava";
		
		char[] ch1 = s1.toCharArray(); // represents the chars of s1
		char[] ch2 = s2.toCharArray();  // represents the chars of s2
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		boolean isAnagram = Arrays.equals(ch1,  ch2);
		System.out.println(isAnagram);

		
		
		
		
	}

}
