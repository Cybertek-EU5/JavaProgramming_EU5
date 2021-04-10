package week3;

public class MethodPractice {
	
	public static void main(String[] args) {
		int age = 35;
		
		CustomMethodPractice2.eligibleOrNot(age);
		
		System.out.println(   isEven(200) );

		System.out.println(factorialNumber(5) );
		
	}
	
	
	public static boolean isEven(int number) {
		
		return (number%2 ==0)? true :false;
	}
	
	// factorial number of 5:  5*4*3*2*1 = 120
	public static int factorialNumber(int number) {
		
		int result = 1;
		while(number > 0) {
			result *= number;
			number--;
		}
		
		
		return result;
	}
	
	

}
