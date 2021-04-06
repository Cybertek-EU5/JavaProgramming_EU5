package day19_stringManipulation_part1;

public class task76_PrintingEachCharacter {

	public static void main(String[] args) {
		
		String str = "Cybertek School";
		
		for(int i=0;i<str.length();i++) {  //last character index is ALWAYS length()-1
			
			System.out.println(str.charAt(i));
			
		}
		
		

	}

}
