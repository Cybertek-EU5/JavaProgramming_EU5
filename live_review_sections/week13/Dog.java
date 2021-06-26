package week13;

public class Dog extends Animal{
	
	

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
	
	
	

}
