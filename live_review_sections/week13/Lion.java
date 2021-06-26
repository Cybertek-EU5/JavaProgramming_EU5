package week13;

public class Lion extends Animal{

	public Lion() {
		super("Lion");
		
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating a deer");
	}
	
	

}
