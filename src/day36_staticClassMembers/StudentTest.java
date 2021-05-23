package day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike",30,1000);
		Student s2 = new Student("Ozzy",20,2000);
		Student s3 = new Student("Jamal",10,3000);
		
		s1.school="CybertekEU";
		//whenever i make changes, this change is reflected in class level
		//so all other object will be affected thru this change
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		

	}

}
