package week13;

import java.util.ArrayList;
import java.util.Arrays;

public class Polymorphism {
	
	
	public static void main(String[] args) {
		
		Animal animal1 = new Dog();
		animal1.eat();
	//	animal1.bark();
		( (Dog)animal1 ).bark();  // down-casting
	//	( (Eagle)animal1 ).fly();  // IS A relation ship is required 
		
	//	( (Dolphin)animal1 ).swim();
		
		
		Animal animal2 = new Lion();
		animal2.eat();
		
		Animal animal3 = new Eagle();
		animal3.eat();
		
		ArrayList<Animal> animals = new ArrayList<>();
		animals.addAll(Arrays.asList(
				new Dog(),
				new Lion(),
				new Dolphin(),
				new Eagle()
				));
		
		
		
		
	}
	

}
