package day10_controlFlowStatements_4;

public class task45_RepeatedBiggerNumber {

	public static void main(String[] args) {
		
		int num1=50;
		int num2=120;
		int repeat=4;
		
		for(int i=1;i<=repeat;i++) {
			
			
			if(num1>num2) {
				System.out.println("Number1 is greater than Num2");
			}else if(num2>num1) {
				System.out.println("Number2 is greater than Num1");
			}else if(num1==num2) {
				System.out.println("Num1 is equal to Num2");
			}
			
			
			
		}
		
		

	}

}
