package week13;

public class Dog extends Animal implements Playable, Swimmable{
	
	

	public Dog() {
		super("Dog");
		
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating dog food");
		
	}
	
	public void bark() {
		System.out.println(name+" is barking");
	}

	@Override
	public void swim() {
		System.out.println(name+" is swimming");
		
	}

	@Override
	public void friendly() {
		System.out.println(name+" is very friendly");
		
	}
	
	
	

}
