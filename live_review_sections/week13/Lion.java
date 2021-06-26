package week13;

public class Lion extends Animal implements Hunt{

	public Lion() {
		super("Lion");
		
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating a deer");
	}

	@Override
	public void hunting() {
		System.out.println(name+" is hunting a deer");
		
	}
	
	

}
