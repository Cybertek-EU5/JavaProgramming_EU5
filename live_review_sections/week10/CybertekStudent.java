package week10;

public class CybertekStudent {
	
	public  String name;
	public  int age;
	public  String batch;
	
	public CybertekStudent(String name, int age, String batch) {
		this.name = name;
		this.age = age;
		this.batch = batch;
	}
	
	
	public static String schoolName;
	public static String programmingLanguage;
	
	static {
		schoolName = "Cybertek School";
		programmingLanguage = "Java";
	}
	
	public void printName() {
		System.out.println("Student Name: "+name);
	}
	
	public static void printSchoolName() {
		System.out.println("School Name: "+schoolName);
	}
	
	public void printNameAndLanguage() {
		System.out.println("Student Name: "+name);
		System.out.println("Programming Language: "+programmingLanguage);
	}

	@Override
	public String toString() {
		return "CybertekStudent [name=" + name + ", age=" + age + ", batch=" + batch + "]";
	}
	
	
	
	

}
