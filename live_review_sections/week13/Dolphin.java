package week13;

public class Dolphin extends Animal implements Hunt, Swimmable {

	public Dolphin() {
		super("Dolphin");
	
	}

	@Override
	public void hunting() {
		System.out.println(name+" is hunting fish");
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating fish");
		
	}

	@Override
	public void swim() {
		System.out.println(name+" is swimming");
		
	}
	
	

}
