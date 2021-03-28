package day07_control_flow_statements;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int score = 60;
		
		if(score>=70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			
		}else {
			
			System.out.println("You failed");
		}
		
		System.out.println("*******************");

		int sales,bonus;
		double commisionRate,salary;
		
		sales=5000;
		salary=10000;
		
		if(sales>5000) {
			bonus=500;
			commisionRate=1.12;
			
			
		}else {
			bonus=100;
			commisionRate=1.10;
		}
		
		salary=salary*commisionRate+bonus;
		
		System.out.println("Salary = " + salary);


	}

}
