package day08_control_flow_statements_2;

public class Task34_AverageGrading {

	public static void main(String[] args) {
		
		int math=0;
		int chemistry=70;
		int biology=10;
		
		double average= (math+chemistry+biology)/3;  
		System.out.println("Average is " + average);
		
		if(average>=0 && average<=59) {
			System.out.println("Grade is F");
		}else if(average>=60 && average<=69) {
			System.out.println("Grade is D");
		}else if(average>=70 && average<=79) {
			System.out.println("Grade is C");
		}else if(average>=80 && average<=89) {
			System.out.println("Grade is B");
		}else if(average>=90 && average<=100) {
			System.out.println("Grade is A");
		}

	}

}
