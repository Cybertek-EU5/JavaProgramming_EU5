package week13;

public class Duck extends Animal implements Flyable, Swimmable, Playable{

	public Duck() {
		super("Duck");
	
	}

	@Override
	public void swim() {
		System.out.println(name+" is swimming");
		
	}

	@Override
	public void fly() {
		System.out.println(name+" is flying");
		
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating herbs");
		
	}

	@Override
	public void friendly() {
		System.out.println(name+" is friendly");
		
	}

}
