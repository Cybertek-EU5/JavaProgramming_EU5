package week2;

public class IfStatements3 {

	public static void main(String[] args) {
		int month = 13;

		// 30 days: 4,6,9,11
		boolean month28Days = month == 2;
		boolean month30Days = month == 4 || month == 6 || month == 9 || month == 11;
		// boolean month31Days = !month28Days && !month30Days;

		if (month >= 1 && month <= 12) {

			if (month28Days) {
				System.out.println(28 + " days");
			} else if (month30Days) {
				System.out.println("30 days");
			} else {
				System.out.println("31 days");
			}

		} else {
			System.out.println("Invalid Number");
		}

		System.out.println("---------------");
		int day = 5;
		String name = "";
		
		if(day >=1 && day <=7) {
			
			if(day==1) {
				name = "Monday";
			}else if(day == 2) {
				name = "Tuesday";
			}else if(day ==3){
				name = "Wednesday";
			}else if(day ==4) {
				name = "Thursday";
			}else if(day == 5) {
				name = "Friday";
			}else if(day == 6) {
				name = "Sdaturday";
			}else {
				name = "Sunday";
			}
			
		}else {
			name = "Invalid Day";
		}
		
		System.out.println(name);
		
		
		
		
		
		
		
		

	}

}

/*
 * write a program that can find the number of days in a month (Assume that Feb
 * has 28 days) ex: month = 3 output: 31 days month = 4 output: 30 days month =
 * 13 output: Invalid month
 * 
 * HINT: 28 days: 2 30 days: 4,6,9,11 31 days: 1,3,5,7,8,10,12
 */