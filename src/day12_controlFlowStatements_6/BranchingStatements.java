package day12_controlFlowStatements_6;

public class BranchingStatements {

	public static void main(String[] args) {
		
		int number = 0;
		
		while(number<15) {
			
			number++;
			
			if(number<=5) {
				
		        System.out.println("Skipping number " + number);
				
				continue;
			}
			
			System.out.println("number = " + number);
			
			if(number>=10) {
				
				System.out.println("Breaking at " + number);
				
				break;
			}
		}

	}

}
