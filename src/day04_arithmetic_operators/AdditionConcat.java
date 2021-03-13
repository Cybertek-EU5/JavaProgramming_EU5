package day04_arithmetic_operators;

public class AdditionConcat {

	public static void main(String[] args) {
		
			//Number + Number :Addition
			System.out.println(2+2);
			System.out.println(20+200);
			
			//Number+String : Concatenation
			System.out.println(5 + "hello");
			
			//String+Boolean : Concatenation
			System.out.println("hello" + true);
			
			//String+String : Concatenation
			System.out.println("hello" + "world");
			
			//Boolean+Number
			//System.out.println(true+1);
			
			System.out.println(2+0+3+"Cybertek"); //5Cybertek
			System.out.println("Cybertek"+2+0+5); //Cybertek205
			System.out.println(2+0+5+"Cybertek"+2+0+5); //7Cybertek205
			System.out.println(2+0+5+"Cybertek"+(2+0+1));
			
			
			
			
	}

}
