package week13;

public class Dolphin extends Animal implements Hunt, Swimmable, Playable {

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

	@Override
	public void friendly() {
		System.out.println(name +" is friendly");
		
	}
	
	

}
