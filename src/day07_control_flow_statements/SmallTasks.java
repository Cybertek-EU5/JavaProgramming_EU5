package day07_control_flow_statements;

public class SmallTasks {

	public static void main(String[] args) {
			
		//1-Write an if statement that assigns 5 to x when y is equal to 20
		int x,y;
		x=0;
		y=10;
		
		if(y==20) {
			x=5;
			
		}
		System.out.println("x = " + x + " y = " + y);
		
		//2-Write an if statement that multiplies payrate by 1.5 if hours is greater than 40
		double payRate=1000;
		int hours=50;
		
		if(hours>40) {
			payRate=payRate*1.5;
		}
		
		System.out.println("Payrate is " + payRate);
		
		//3-Write an if statement that sets the variable fees to 50 if the boolean variable max is true
		
		boolean max = false;
		int fee=20;
		
		if(max) {
			fee=50;
		}
		System.out.println("Fee is " + fee);
		
		//4-Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater 
		//and equal to 100
		
		int a = 100;
		int b = 50;
		int c = 300;
		
		if(b==50 && c>=100) {
			a=20;
		}
		
		System.out.println("a = " + a);
		
		//5-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80
		
		int temp=75;
		
		if(temp>=70 && temp<=80) {
			
			System.out.println("Ideal Temp");
		
		}

}}
