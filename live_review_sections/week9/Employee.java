package week9;

public class Employee {
	
	public String name, jobTitle;
	public int id;
	public double salary;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, String jobTitle) {
		this(name);
		this.jobTitle = jobTitle;
		
	}

	public Employee(String name, String jobTitle, int id) {
		this(name, jobTitle);
		this.id = id;
	}

	public Employee(String name, String jobTitle, int id, double salary) {
		this(name, jobTitle, id);
		this.salary = salary;
	}

	
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", id=" + id + ", salary=$" + salary + "]";
	}
	
	


}


/*
			instance variables: 
					name, jobTitle, ID, salary

			1st constructor: initialize the name of the employee

			2d constructor: initialize the name, jobTitle of the employee
							(MUST apply constructor Call)

			3rd Constructor: initialize the name, jobTitle, ID of the employee
							(MUST apply constructor Call)

			4th Constructor: initialize all the instance of the employee
								(MUST apply constructor Call)

			Instance methods:
				toString()		


*/