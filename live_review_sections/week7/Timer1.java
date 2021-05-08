package week7;

import java.util.Scanner;

public class Timer1 {

	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the number of hours");
		int hours = scan.nextInt();
		scan.close();
		
		for (int j = hours; j > 0; j--) {
			if (j < 0) {
				break;
			}

			for (int i = 60; i >= 0; --i) {
				
				for (int z = 59; z >= 0; --z) {
					System.out.print("\r"+(j-1)+" hours " + (i - 1) + " minutes and " + z + " seconds left");
					Thread.sleep(1000); // pauses the execution of the code for given milli seconds
				}
			}
		}

		System.out.println("\n\n");

		System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.err.println("\t\t\t*                                                 *");
		System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
		System.err.println("\t\t\t*                                                 *");
		System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

	}

}
