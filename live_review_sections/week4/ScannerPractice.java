package week4;

import java.util.Scanner;

public class ScannerPractice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max = -2147483648;  // user cannot enter any number smaller than this
		// max = 30
		
		int min = 2147483647; // user cannot enter any number larger than this
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Enter a number: ");
			int number = scan.nextInt();   // 1, 2, 3, 1, 5
			
			if(number > max) {  // compare the inputs with each other, at the end the maximum number will be assigne to max
				max = number;  // if the input is greater than previous then it will be assigned to max
			}
			
			
			if(number < min) { // compare the inputs with each other, at the end the minimum number will be assigne to min
				min = number;	// if the input is smaller than previous then it will be assigned to max
			}
			
		}
		
		scan.close();
		
		
		System.out.println("Maximum number: "+max);
		System.out.println("Minimum number: "+min);
		
		
		
		
		
		
		
		
	}

}
