package week3;

public class WhileLoopPractice {
	
	
	public static void main(String[] args) {
		
		for(int i =0; i < 5; i++) {
			System.out.println("Hello World");
		}
		
		System.out.println("------------------------------");
		
		int j=1; 
		while(j++ <= 5) {
			System.out.println("Hello World");
		}
		
		System.out.println("--------------------------------");
		
		int k = 1;
		int l = 100;
		while(k < l) {
			System.out.print(k++ +" ");
		}
		
		System.out.println("\n-------------------------------");
		int q = 1;
		
		do {
			
			System.out.println("Hello");
			
		}while(q++ <= 5);
		
		System.out.println("---------------------------------");
		int p =1;
		while(p++ <= 5) {
			System.out.println("Hello");
		}
		
		
	}
	

}
