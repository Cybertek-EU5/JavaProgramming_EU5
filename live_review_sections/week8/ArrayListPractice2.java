package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a number: ");
			list.add( scan.nextInt() );
			
			System.out.println("Do you wanna add another number?");
			String a = scan.next().toLowerCase();
			
			if(a.equals("no")) {
				break;
			}
			
		}
		
		
		System.out.println( list );
		
		

	}

}
