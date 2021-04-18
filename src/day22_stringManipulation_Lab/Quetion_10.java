package day22_stringManipulation_Lab;

public class Quetion_10 {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited"));
		

	}
	
	public static boolean frontAgain(String str) {
		
		String first2 = str.substring(0,2);         //edited 
		String last2 = str.substring(str.length()-2);
		
		return first2.equals(last2);
		
		
	}

}
