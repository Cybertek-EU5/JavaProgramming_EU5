package week5;

public class SalaryObjects {
	
	public static void main(String[] args) {
		
		Salary salary1 = new Salary();  // employee1
		salary1.setInfo(45, 40, 0.3);
		
		
		/*
		salary1.rate = 45;
		salary1.weeklyHour = 40;
		salary1.taxRate = 0.3;
		*/
		
		System.out.println(salary1);
		
		Salary salary2 = new Salary(); // employee2 :  hourlyRate = $55, weeklyHour = 45 hours
	//	salary2.setInfo(55, 45, 0.28);
		
		System.out.println(salary2);  //toString method gets executed automatically
		
		System.out.println("------------------------------------------");
		// employee2 hourlyRate = $65
		salary2.rate = 65;
		
		System.out.println(salary2);
		
		
		
	}

}
