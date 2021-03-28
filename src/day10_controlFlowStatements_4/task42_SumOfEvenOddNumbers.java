package day10_controlFlowStatements_4;

public class task42_SumOfEvenOddNumbers {

	public static void main(String[] args) {
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1;i<100;i++) {
			
			if(i%2==0) {
				
				sumEven=sumEven+i;  
				  
			}else {
				
				sumOdd=sumOdd+i;   
				
			}
		}
		
		System.out.println("Sum of even number " + sumEven);
		System.out.println("Sum of odd number " + sumOdd);

	}

}
