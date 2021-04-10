package week3;

public class BranchingStatements {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;  // exits the current loop
			}
		}
		
		System.out.println("---------------------------------------------");
		
		for(int i = 10; i <= 100; i+= 10) {
			if( i == 50 || i == 70) {
				continue;  // 
			}
			
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------");
		
		for(int i = 1; i <= 21; i++) {
			if(i%3 ==0) {
				continue; // skips
			}
			
			System.out.print(i +" "); //1 2 4 5 7 ...
		}
		
		System.out.println("\n-------------------------------------------");
		
		for(int i = 1; i <= 18; i++) {
			if(i %2 != 0 ) {
				continue;
			}
			
			if(i > 12) {
				//return;  // exits the current method
				break; //exits the current loop
			}
			System.out.print(i+" ");
			
		}
		
		
		System.out.println("\nHello EU 5");
		
		
		
		
	}

}
