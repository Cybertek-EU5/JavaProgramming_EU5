package day37_inheritance;

public class Student extends Person {  //student can have everything person class has 

	int studentId;
	String termClass;
	
	public void code(String lang) {
		System.out.println(name + " is coding " + lang);
	}
	
	public void attendClass() {
		System.out.println(name + " is attending " + termClass + " class");
	}

}
