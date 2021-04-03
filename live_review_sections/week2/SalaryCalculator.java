package week2;

public class SalaryCalculator {

	public static void main(String[] args) {
		int hourlyRate  = 60; // dollars per hour
		double taxRate = 0.3; 
		int weeklyHour = 40; // hours in a week
		
		
		// annual salary before tax:
		int salary = (hourlyRate * weeklyHour) * 48 ;
		System.out.println("Your salary is: $" + salary);
		
		// total tax:
		double totalTax = salary * taxRate;
		System.out.println("Your total tax is: $"+totalTax);
		
		// salary after tax:
		double salaryAfterTax = salary - totalTax;
		System.out.println("Your salary after tax is: $"+salaryAfterTax);
		
		
		// each month' take home salary
		double eachMonth = salaryAfterTax / 12;
		System.out.println("Each month' take home salary is: $"+eachMonth);
		
		
		

	}

}


/*
write a program that can calculate the tax, salary & salary after tax based on 
the hourly rate & tax rate

                ex:
                         rate = 50;
                        taxRate = 0.3;  
                        weeklyHours = 40;

                    then output will be:
                            your salary is: 96000 USD
                            your total tax is: 28800 USD
                            your income after tax is: 67200 USD

                Assume that a year has 48 weeks (excluding PTO)

*/