package day13_methods_Part1;

public class task61_AgeCalculator {

	public static void main(String[] args) {
		
		
		ageCalculator(2019, 1965);
		ageCalculator(2019, 1875);
		

	}
	
	public static void ageCalculator(int currentYear,int birthyear) {
		
		int age = currentYear - birthyear;
		
		System.out.println(age);
	}

}
