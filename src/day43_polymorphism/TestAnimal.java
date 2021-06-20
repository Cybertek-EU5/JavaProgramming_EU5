package day43_polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		
		Animal dog = new Dog();
		
		Animal bird = new Bird();
		
		animal = new Cat();
		
		//Bird bird2 = new Animal();
	
	}

}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}

class Cat extends Animal{}

