package week10;

public class Microsoft {

	public static void main(String[] args) {
		
		Tester tester1 = new Tester("Alperen", "Male", "SDET", 123, 100000);
		Tester tester2 = new Tester("Yasin", "male", "SDET", 126, 110000);
		Tester tester3 = new Tester("Zina", "female", "SDET", 456, 110000);
		
		Tester[] testers = {tester2, tester3};
		
		
		Developer developer1 = new Developer("Akhtam", "Male", "Java Developer", 126,120000);
        Developer developer2 = new Developer("Atilla", "Male", "C++ Developer", 127,170000);
	    Developer developer3 = new Developer("Erhan", "Male", "Java Developer", 128,195000);
	    Developer developer4 = new Developer("Ozzy", "Male", "Phyton Developer", 129,115000);
	    
	    Developer[] develoers = { developer2, developer3, developer4};
		
		System.out.println(tester1);
		System.out.println(developer1);
		
		tester1.creatingTicket();
		developer1.coding();
		
		
		Scrumteam scrum1 = new Scrumteam("Omer", "Rasim", "Zeynep");
		
		scrum1.addTester(tester1);
		scrum1.addTester(testers);
		
		scrum1.addDeveloper(developer1);
		scrum1.addDeveloper(develoers);
		
		System.out.println("Total Number of testers: " + scrum1.testers.size());
		System.out.println("Total Number of Developers: " + scrum1.developers.size() );
		
		System.out.println(scrum1);
		
		
		
	    
	    
	}
	
}
