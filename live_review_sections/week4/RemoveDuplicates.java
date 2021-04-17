package week4;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		String str = "aabbcc";
		String result = ""; // a
		
		for(int i=0; i <  str.length(); i++) {
			String each =""+ str.charAt(i);  // a, a, b, b, c, c
			
			/*
			if(result.contains(each)) { // if the character is already in the result, we skip to the next character
				continue;
			}
			*/
			
			if(!result.contains(each)) {
				result += each; // if the character is not contained in the result yet then we add it
			}
		}
		
		
		System.out.println(result);
		
		
		
		
	}

}

/*

	Write a program that can remove duplciated characters from a string

		ex:
			str = "aaaabbbbbbcccccccccdddd"

			output:
				abcd


*/