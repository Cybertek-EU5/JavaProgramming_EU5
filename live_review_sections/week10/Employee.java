package week10;

public class Employee {
	
	public String name,
				gender,
				jobTitle;
	
	public int employeeId;
	public double salary;
	
	public static boolean isEmployeed = true;
	
	public Employee(String name, String gender, String jobTitle, int employeeId, double salary) {
		this.name = name;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	
	public void eat() {
		System.out.println(name+" is eating");
	}
	
	public void sleep() {
		System.out.println(name+" is sleeping");
	}
	
	public void work() {
		System.out.println(name +" is working");
	}


	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", jobTitle=" + jobTitle + ", employeeId=" + employeeId
				+ ", salary=" + salary + "]";
	}
	
	
	
	

}

/*
create a class called Employee
	name, gender, employeeID, JobTitle, Salary
	eat(), sleep(), work(), toString()
*/