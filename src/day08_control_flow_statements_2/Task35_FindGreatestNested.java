package day08_control_flow_statements_2;

public class Task35_FindGreatestNested {

	public static void main(String[] args) {
		
		int n1=1000;
		int n2=2000;
		int n3=3000;
		
		//find the greatest by using nested if 
		
		if(n1>n2 && n1>n3) {
			System.out.println("n1 is biggest");
		}else {
			if(n2>n3) {
				System.out.println("n2 is biggest");
			}else {
				System.out.println("n3 is biggest"); //n3>n2
			}
		}

	}

}
