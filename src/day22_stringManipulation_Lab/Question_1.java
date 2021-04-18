package day22_stringManipulation_Lab;

public class Question_1 {

	public static void main(String[] args) {
		
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
		
		

	}
	
	public static String helloName(String str) {
		
		return "Hello ".concat(str).concat("!");
		
		
	}

}
