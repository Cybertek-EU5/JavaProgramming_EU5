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
	
	
	// removes the duplicates from string
		public static String removeDuplicates(String str) {

			String result = ""; // ab

			for (int i = 0; i < str.length(); i++) {
				if (!result.contains("" + str.charAt(i))) {
					result += str.charAt(i);
				}
			}

			return result;
		}

		// returns the frequency of ch from str. frequency(String, char) ("aaa", 'a') ==> 3
		public static int frequency(String str, char ch) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			return count;
		}
		
		// returns the frequency of the word from a sentence
		public static int frequency(String sentence, String word) {
			sentence = sentence.toLowerCase();
			word =word.toLowerCase();
			int count = 0;
			while(sentence.contains(word)) {
				sentence = sentence.replaceFirst(word, "");
				count++;
			}
			
			return count;
		}

		// returns the frequency of each characters from the string
		public static String frequencyOfChars(String str) {
			String nonDup = removeDuplicates(str); // abc

			String result = ""; // a3b2c4

			for (int i = 0; i < nonDup.length(); i++) { // used for iterating the characters of nonDup
				int count = frequency(str, nonDup.charAt(i)); // getting the frequency of each character
				result += nonDup.charAt(i) + "" + count;
			}
			return result;
		}

	
	
	

}
