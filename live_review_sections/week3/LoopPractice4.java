package week3;

public class LoopPractice4 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {  // i: 1,2,3,4,5,6,7,8,9.. 100
			
			if(i %15 == 0) {
				System.out.print("FINRA ");
			}else if(i % 3 ==0) {
				System.out.print("FIN ");
			}else if(i%5 ==0) {
				System.out.print("RA ");
			}else {
				System.out.print(i+" ");
			}
			
		}
		
		System.out.println("\n-------------------------------------------");
		
		
		for(int i = 1; i <= 100; i++) {  // i: 1,2,3,4,5,6,7,8,9.. 100
			
			System.out.print( (i %15 == 0)? "FINRA " :(i % 3 ==0)? "FIN " :(i%5 ==0)? "RA " : i+" "  );
		}
		
		
		
		
		
		
		
	}
	

}

/*
 1. Write a method which prints out the numbers from 1 to 100 but:
 for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number, 
 for numbers which are a multiple of 3, print "FIN" instead of the number 
 for numbers which are a multiple of 5, print "RA" instead of the number. 
    
    ex: 
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....

*/