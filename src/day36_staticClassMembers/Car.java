package day36_staticClassMembers;

public class Car {
	
	int door;
	
	public static void run() {
		System.out.println("Car is running");
	}
	
	public int getDoorNumber() {
		return door+2;
	}

}

class CarTest{
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.run();
		
		Car.run();
	}
}
