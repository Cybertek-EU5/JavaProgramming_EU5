package day06_logical_operators;

public class Task23_Operators {

	public static void main(String[] args) {
		
		double d1 = 20;
		double d2 = 80;
		
		double res = (d1+d2)*25;
		
		double remainder = res%40;
		
		System.out.println("Ramaining total is equal to 20 or less? - " + (remainder<=20));
		
		

	}

}
