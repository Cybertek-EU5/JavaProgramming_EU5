package week13;

public class Eagle extends Animal implements Hunt, Flyable {
	
	
	public Eagle() {
		super("Eagle");
		
	}

	@Override
	public void hunting() {
		System.out.println(name+" is hunting snake");
		
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating snake");
		
	}

	@Override
	public void fly() {
		System.out.println(name+" is flying");
		
	}
	
	

}
