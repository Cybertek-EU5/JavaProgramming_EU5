package week8;

public class Employee {
	
	public String name, jobTitle;
	public int ID;
	public double salary;
	
	public Employee(String name, String jobTitle, int iD, double salary) {
								// allows us to initialize all instances of Employee object
		this.name = name;
		this.jobTitle = jobTitle;
		ID = iD;
		this.salary = salary;
	}

	
	public String toString() {  //allows us to print the Employee object
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", ID=" + ID + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
}

/*
conde snippet:

	```
	codes
	```
*/

/*

Employee:
	attribute
		name, jobTitle, ID, salary
	
	add a constructor to initialize all the fields
	
	toString()

*/