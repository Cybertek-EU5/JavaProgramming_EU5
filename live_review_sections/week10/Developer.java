package week10;

public class Developer extends Employee {

	public Developer(String name, String gender, String jobTitle, int employeeId, double salary) {
		super(name, gender, jobTitle, employeeId, salary);
		
	}
	
	
	public void coding() {
		System.out.println(name+" is coding");
	}

	public void fixingBugs() {
		System.out.println(name+" is crying");
	}
	
	
}

/*
create a class called Developer
Attributes:
    name, gender, employeeID, JobTitle, Salary

Actions:
   	coding(),  fixingBug(), toString()

*/