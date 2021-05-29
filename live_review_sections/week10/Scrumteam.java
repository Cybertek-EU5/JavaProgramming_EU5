package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class Scrumteam {
	
	public String PO, BA, SM;
	
	public ArrayList<Tester> testers = new ArrayList<>();
	public ArrayList<Developer> developers = new ArrayList<>();
	
	public Scrumteam(String pO, String bA, String sM) {
		PO = pO;
		BA = bA;
		SM = sM;
	}
	
	public void addTester(Tester tester) {  // adds one tester into the testers arraylist
		testers.add(tester);
	}
	
	public void addTester(Tester[] testers) { // adds each testers from given array to the arraylist testers
		this.testers.addAll( Arrays.asList( testers )  );
	}
	
	public void addDeveloper(Developer developer) {
		developers.add(developer);
	}
	
	public void addDeveloper(Developer[] developers) {
		this.developers.addAll( Arrays.asList(developers)  );
	}

	
	
	public void removeTester(int id) {  // removes the tester with the given ID
		testers.removeIf(p -> p.employeeId == id);
	}
	
	public void removeDeveloper(int id) { // removes the developer with the given ID
		developers.removeIf(p -> p.employeeId == id);
	}
	
	
	public String toString() { // prints the PO, SM, BA, total number of tester  and total number of developers
		return "Scrumteam [PO=" + PO + ", BA=" + BA + ", SM=" + SM + ", testers=" 
	+ testers.size() + ", developers="+ developers.size() + "]";
	}
	
	

}
/*
Attributes:
        PO, BA, SM
        ArrayList<Tester> testersList = new ArrayList<>(),
        ArrayList<Developer> devopsList = new ArrayList<>(),
        

Add a constructor that can set PO, BA, SM

Actions:
addTester(Tester tester): adds the given tester to the testers arraylist

addTesters(Tester[] testers): adds the given testers to the testers arraylist

addDeveloper(Developer developer): adds the given developer to the developers arraylist

addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

removeTester(long employeeID): removes the given tester from the testers arraylist

removeDeveloper(long employeeID): removes the developer from the developers arraylist

toString(): prints number of tester,& developers,  PO name, SM name, BA name
*/