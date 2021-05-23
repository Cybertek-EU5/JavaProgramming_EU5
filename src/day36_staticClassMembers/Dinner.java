package day36_staticClassMembers;

public class Dinner {
	
	static int pizzaSlice = 8;
	
	public void takeASlice() {
		pizzaSlice--;
	}
	
	public void takeASlice(int count) {
		pizzaSlice-=count;
	}

}
