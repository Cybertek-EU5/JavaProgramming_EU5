package day41_abstract_class;

public abstract class Animal {
	
	//Instance variable
	String name;
	
	//Static variable
	private static int age;
	
	
	/*
	 * Desription:Calculating Salary
	 * Author:Ozzy
	 * @param: String title(@link Employee)
	 * @Return: void 
	 * 
	 */
	
	//Abstract Method
	 abstract  void eat(); //abstract method 
	//Abstract Method
	abstract void breathe();
	
	//Instance method
	private void sing() {
		System.out.println("Animal is singing");
	}
	
	//Constructor

	public Animal() {

	}

	public Animal(int age) {
		this.age=age;
	}
	
	//Instance block
	{
		System.out.println("This is instance block");
	}
	
	//Static block
	static {
		System.out.println("This is static block");
	}

}


