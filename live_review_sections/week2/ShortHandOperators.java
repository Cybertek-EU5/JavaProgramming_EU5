package week2;

public class ShortHandOperators {
	
	public static void main(String[] args) {
		int hourlyRate = 50;
		int weeklyHours = 40;
		
		int tax = 200;
		
		int weeklyPayCheck = 0;  // 2000
		
		weeklyPayCheck +=  hourlyRate * weeklyHours;  // 2000
		// weeklyPayCheck += 2000; 
		
		weeklyPayCheck -= tax;  // 1800
		
		
		System.out.println(weeklyPayCheck);
		
		System.out.println("---------------------------------------");
		
		int a = 30;
		
		a *= 3;  // 90
		
		
		int b = 100;
	//	b = b/2;
		b /= 2;
		
		System.out.println(b);
		
		
		int c = 300;
		// c= c%100;
		c %= 100;
		
		System.out.println(c);
		
		System.out.println("------------------------------------");
		// concatenation
		
		String name = "Cybertek";
		
		System.out.println(name);  // Cybertek
		
		name += " Shcool";
		
		System.out.println(name); //Cybertek School
		
		
		
		
	}

}
