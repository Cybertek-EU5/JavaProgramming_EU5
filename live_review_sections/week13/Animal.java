package week13;

public abstract class Animal {
	
	public String name;
	
	
	public Animal(String name) {
		
		this.name = name;
	}


	public abstract void eat();
	

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	


}
