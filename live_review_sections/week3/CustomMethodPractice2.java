package week3;

public class CustomMethodPractice2 {
	
	
	
	public static void main(String[] args) {
		int person1 =10;
		eligibleOrNot(person1);
		
		int person2 = 20;
		eligibleOrNot(person2);
		
		int person3 =30;
		eligibleOrNot(person3);
		
			
	}
	
	
	public static void eligibleOrNot(int age) {
		if(age >= 21) {
			System.out.println("Eligible to buy");
		}else {
			System.out.println("Not eligible to buy");
		}
		
	}
	
	
	
	
	
	
	

}
