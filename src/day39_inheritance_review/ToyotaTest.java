package day39_inheritance_review;

public class ToyotaTest {

	public static void main(String args[]) {
		
		Toyota toyota = new Toyota(36);
		
		toyota.steer(45);
		toyota.accelerate(30);
		toyota.accelerate(20);
		toyota.accelerate(-42);
	}

}

