package week12;

public final class Tesla extends Car {

	public Tesla( String model, String color, int year) {
		super("Tesla", model, color, year);
		
	}

	@Override
	public void start() {
		System.out.println("Say Start");
	
	}
	
	
	public void autoPilot() {
		System.out.println("Tesla is self driving");
	}
	
	
}
