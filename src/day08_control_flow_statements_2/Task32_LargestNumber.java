package day08_control_flow_statements_2;

public class Task32_LargestNumber {

	public static void main(String[] args) {
			
		int num1=10000;
		int num2=2000;
		int num3=300;
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println("Num1 is greatest one");
		}else if((num2>num1)&&(num2>num3)) {
			System.out.println("Num2 is greatest one");
		}else if((num3>num1)&&(num3>num2)) {
			System.out.println("Num3 is greatest one");
		}else {
			System.out.println("Numbers are equal");
		}
	}

}
