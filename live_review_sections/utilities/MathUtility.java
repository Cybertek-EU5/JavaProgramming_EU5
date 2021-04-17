package utilities;

public class MathUtility {
	
	public static int max(int a, int b) {
		return (a>=b)? a : b;
	}
	
	public static double max(double a, double b) {
		return (a>=b)? a : b;
	}
	
	public static int min(int a, int b) {
		return (a<=b)? a : b;
	}
	
	public static double min(double a, double b) {
		return (a<=b)? a : b;
	}
	
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static double addition(double a, double b) {
		return a+b;
	}
	
	public static int addition(int a, int b, int c) {
		return addition(a, b)+c;
	}
	
	public static double addition(double a, double b, double c) {
		return addition(a, b) + c;
	}
	
	

}
