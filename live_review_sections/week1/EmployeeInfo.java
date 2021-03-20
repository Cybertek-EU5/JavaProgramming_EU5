package week1;

public class EmployeeInfo {
	
	public static void main(String[] args) {
		String name = "Daniel";
		String companyName = "Apple";
		String jobTitle = "SDET";
		char gender = 'M';
		double salary = 100000;
		int employeeID = 123;
		boolean hasBenefits = true;
		boolean isMarried = false;
		
		// Employee Name is: 
		System.out.println("Employee name is: " + name);
		System.out.println("Employee gender si: "+gender );
		System.out.println("Company name is: "+companyName);
		System.out.println("Employee ID is: "+employeeID);
		// System.out.println("Employee' job title is: "+jobTitle);
		System.out.println( name+" wants to be "+jobTitle);
		System.out.println(name+" wants to make $"+(int)salary+" a year");
		System.out.println("Employee is married: "+isMarried);
		
		
		
		
		/*
		System.out.println(13+"2"); // 132
		System.out.println(1+1+"1"); // 2+"1" ==> 21
		System.out.println(1+1+1);  //3
		*/
		
		
		
		
	}
	

}

/*
 Task01. create a class called EmployeeInfo:
  1. declare the following variables: name, gender, isMarried, hasBenefits, companyName, 
  	employeeId, jobTitle, salary 
  2. print:
        your company's name
        your Name
        your employee Id
        your job title
        your salary
 */
