package week3;

public class MethodPractice {
	
	public static void main(String[] args) {
		int age = 35;
		
		CustomMethodPractice2.eligibleOrNot(age);
		
		System.out.println(   isEven(200) );

		
	}
	
	
	public static boolean isEven(int number) {
		
		return (number%2 ==0)? true :false;
	}
	
	// factorial number of 5:  5*4*3*2*1 = 120
	
	
	

}
