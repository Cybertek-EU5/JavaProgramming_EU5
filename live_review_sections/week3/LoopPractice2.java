package week3;

public class LoopPractice2 {
	
	public static void main(String[] args) {
		System.out.print("Even Numbers: ");
		// 0 2 4 6 8 10 .... 1000
		for(int i = 0; i <= 1000;  i += 2) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n--------------------------");
		
		System.out.print("Odd Numbers: ");
		// 1 3 5 7 9 11 13 .... 999
		for(int i = 1; i < 1000; i += 2 ) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n--------------------------");
		System.out.print("Even Numbers: ");
		for(int i =0; i <= 100; i++) {  // i: 0,1,2,3,4,5....1000
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n--------------------------");
		System.out.print("Odd Numbers: ");
		for(int i =0; i <= 100; i++) {  // i: 0,1,2,3,4,5....1000
			if(i % 2 != 0) {
				System.out.print(i+" ");
			}
		}
		
		
		
	}

}

/*
 Task3:
        1. write a program that can print all even numbers between 0 ~ 1000
        2. write a program that can print all odd numbers between 0 ~ 1000
     

 */
