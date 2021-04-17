package utilities;

public class StringUtility {
	
	
	// This method can reverse any given string, and returns the reversed string 
	public static String reverse(String str) {
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) { // i: represents the index numbers starting from last index to 0
			result += str.charAt(i);
		}
		
		return result;
	}
	
	
	// THis method can verify if a give string is palindrome, returns true or false
	public static boolean isPalindrome(String str) {
		return  reverse(str).equalsIgnoreCase(str);
	}
	
	
	

}
