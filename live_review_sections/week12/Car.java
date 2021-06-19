package week12;

public abstract class Car {
	
	public String make, model, color;
	public int year;
	
	public Car(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	public abstract void start();

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", year=" + year + "]";
	}
	
	

}
