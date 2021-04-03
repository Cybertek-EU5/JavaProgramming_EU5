package week2;

public class IfStatements {
	
	public static void main(String[] args) {
		
		int a =10 ;  // assume a,b,c are all different numbers 
		int b = 20;
		int c = 30;
		
		boolean aIsMaximum = a > b &&  a> c; // if a is greater than both b and c
		boolean bIsMaximum = b > a && b > c; // if b is greater than both a and c
		// boolean bIsMaximum = !aIsMaximum && b > c;  // if a is not the maxixmum  and b is greater than c
		
		//boolean cIsMaximum = c > b && c > a;
		//boolean cIsMaximum = !aIsMaximum && !bIsMaximum;
		
		if(aIsMaximum) {
			System.out.println(a+" is maximum");
		}else if(bIsMaximum) {
			System.out.println(b + " is maximum");
		}else {
			System.out.println(c +" is maximum");
		}
		
		System.out.println("-----------------------------------------------");
		
		boolean aIsMinimum = a < b && a < c; // if a is less than both b & c, then a is minimum
		boolean bIsMinimum = b < a && b < c;
		// boolean bIsMinimum = !aIsMinimum && b < c;
		
		boolean cIsMinimum =  c < b && c < a;
		//boolean cIsMinimum =  ! aIsMinimum && !bIsMinimum;
		
		if(aIsMinimum) {
			System.out.println(a+" is minimum");
		}else if(bIsMinimum) {
			System.out.println(b+" is minimum");
		}else {
			System.out.println(c+" is minimum");
		}
		
		System.out.println("---------------------------------------------------");
		
		// write a program that can verify if the person is eligible to buy alcohol
		int age = 20;
		if(age >= 21) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not Eligible");
		}
		
		System.out.println("---------------------------------------------------");
		// odd or even number?
		
		int num  = 100;
		boolean isEven =  num%2  == 0; // if number can be devided by 2 with 0 remainder
		
		if(isEven) {
			System.out.println(num+ " is even");
		}else {
			System.out.println(num +" is odd");
		}
		
		System.out.println("----------------------------------------------");
		
		// zero, or negative, or positive
		int number = 100;
		
		if(number  == 0) {
			System.out.println("Zero");
		}else if(number > 0) {
			System.out.println("Positive number");
		}else {
			System.out.println("Negative number");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
