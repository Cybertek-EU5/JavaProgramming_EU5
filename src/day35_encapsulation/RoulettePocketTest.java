package day35_encapsulation;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your pocket number:");
		
		RoulettePocket rp = new RoulettePocket(sc.nextInt());
		
		while(rp.getPocketColor().equalsIgnoreCase("invalid")) {
			System.out.println("Enter your pocket number:");
			rp.setPocketNumber(sc.nextInt());
		}
		
		System.out.println(rp.getPocketColor());

	}

}
