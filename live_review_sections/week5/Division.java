package week5;

public class Division {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		/*
		 * 10 - 3 - 3 - 3 = 1
		 * 
		 * 10 - 4 - 4 = 2
		 * 
		 * 10 - 2 - 2 - 2 - 2 - 2 = 0
		 * 
		 */

		if (b != 0) {
			int count = 0;

			while (a >= b) {
				a -= b;
				count++;
			}

			System.out.println(count + " with a remainder of " + a);
		}else {
			System.out.println("Invalid Number for denominator");
		}
		
		

	}

}