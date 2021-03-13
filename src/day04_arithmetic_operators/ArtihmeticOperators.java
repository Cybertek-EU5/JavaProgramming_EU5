package day04_arithmetic_operators;

public class ArtihmeticOperators {

	public static void main(String[] args) {
		
		//Addition Operator + 
		//System.out.println(55+5);
		int chairs=140;
		System.out.println(chairs+2);
		System.out.println(chairs);
		//chairs=chairs+2;
		
		int moreChairs=chairs+5;
		//System.out.println(moreChairs);
		
		int tables=130;
		int total=tables+chairs;
		System.out.println(total);
		
		//Subtraction -
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance=balance-transaction;
		System.out.println(balance);
		
		//Create a variable linesOfCode and assign 50 and print "Lines of code 50"
		//delete 2 lines
		//decrease the value of linesOfCode by 2 and print "Lines of Code 48"
		
		int linesOfCode=50;
		System.out.println("Lines of code " + linesOfCode);
		
		linesOfCode=linesOfCode-2;
		System.out.println("Lines of code " + linesOfCode);
		
		//Multiplication *
		System.out.println(22*2);
		
		int classes = 5;
		System.out.println(linesOfCode * classes);
		int totalLinesOfCode=linesOfCode * classes;
		System.out.println("Total Lines of Codes = " + totalLinesOfCode);
		
		//Division /
		System.out.println(10/2);
		System.out.println(60/3);
		
		//System.out.println(11/0); //throw error while running the code
		System.out.println(11*0);
		
		//Remainder %
		System.out.println(10%2);
		System.out.println(9%2);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
