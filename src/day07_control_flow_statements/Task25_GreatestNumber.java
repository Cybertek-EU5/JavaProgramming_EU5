package day07_control_flow_statements;

public class Task25_GreatestNumber {

	public static void main(String[] args) {
		
		int num1=40;
		int num2=8;
		int num3=100;
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("Num1 is the greatest");
		}
		
		if(num2>num1 && num2>num3) {
			System.out.println("Num2 is the greatest");
		}
		
		if(num3>num1 && num3>num2) {
			System.out.println("Num3 is the greatest");
		}

	}

}
