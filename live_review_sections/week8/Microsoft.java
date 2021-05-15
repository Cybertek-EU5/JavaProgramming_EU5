package week8;

public class Microsoft {  // Microsoft HAS A Employee
	
	public static void main(String[] args) {
		
		 Employee[] testers = {	new Employee("Kunduz", "SDET", 123, 150000),
				 					new Employee("Zina", "QE", 321, 170000),
				 					new Employee("Murat", "QA", 789, 105000),
				 					new Employee("Bunyamin", "SDET", 852, 85000)
		 						};
		 
		 double maxSalary = 0;  // 150000
		 double minSalary = Double.MAX_VALUE; //95000
		 
		 String nameOfMaxSalary = "";
		 String nameOfMinSalary = "";
		 
		 for(Employee  each : testers ) {
			 
			 if(each.salary > maxSalary) {
				 maxSalary = each.salary;
				 nameOfMaxSalary = each.name;
			 }
			 
			 if(each.salary < minSalary) {
				 minSalary =  each.salary;
				 nameOfMinSalary = each.name;
			 }
		 }
		 
		 System.out.println("max: "+maxSalary);
		 System.out.println("min: "+minSalary);
		 
		 System.out.println(nameOfMaxSalary+" has the maximum salary");
		 System.out.println(nameOfMinSalary+" has the minimum salary");
		 
		 
		 
	}

}


/*
HAS A relation: 
	
	
	
	


*/