package week2;

public class Ternary {

	public static void main(String[] args) {

		int number = 100;

		String result = "";

		if (number % 2 == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}

		System.out.println(result);

		System.out.println("---------------------------------------");

		String result2 = (number % 2 == 0) ? "Even" : "Odd";

		System.out.println(result2);

		System.out.println("-------------------------------------");
		// positive, negative or zero
		int n = 100;
		
		String result3 = (n == 0)? "Zero" :(n<0)? "Negative" : "Positive";
		
		System.out.println(result3);
		
		System.out.println("------------------------------------------");
		// day < 1 || day >7 -- invalid,  day ==1 --Monday, day==2 -- Tuesday ,....
		
		int d = 0;
		String day = (d ==1)?"Monday" :(d==2)? "Tuesday" :(d==3)?"Wednesday" :(d==4)?"Thursday"
				:(d==5)?"Friday":(d==6)?"Saturday":(d==7)?"Sunday" : "Invalid Day";
		
		System.out.println(day);
		
		System.out.println("----------------------------------------------");
		int a = 10, b = 20, c = 30;  // assume all three numbers are different
		
		int max = (a > b && a > c)? a  :(b > a && b > c)? b : c;
		int min = (a<b && a < c)? a  :(b < a && b < c)?b : c;
		
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		

	}

}
