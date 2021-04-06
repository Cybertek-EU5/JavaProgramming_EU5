package day18_readingUserInput;

import java.util.Scanner;

public class task72_SumNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int sum=num1+num2+num3;
		System.out.println("Sum of numbers:" +  sum);
				
			

	}

}
