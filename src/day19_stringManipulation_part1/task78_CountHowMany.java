package day19_stringManipulation_part1;

public class task78_CountHowMany {

	public static void main(String[] args) {
		
		
		String str = "abcabqcabc";
		char myChar = 'a';
		
		int counter=0; 
		
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==myChar) {
				
				counter++;
			}
			
			
		}
		
		System.out.println("Count for " + myChar + " is " + counter);
		
		
	}

}
