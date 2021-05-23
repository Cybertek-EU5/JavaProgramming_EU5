package day36_staticClassMembers;

public class Calculator {
	
	int x;
	
	public static double plus(double num1,double num2) {
		return num1+num2;
	}
	
	public static double minus(double num1,double num2) {
		return num1-num2;
	}
	
	public static double multiply(double num1,double num2) {
		return num1*num2;
	}
	
	public int m1() {
		return x+4;
	}

}
