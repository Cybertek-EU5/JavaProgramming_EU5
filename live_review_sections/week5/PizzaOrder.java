package week5;

public class PizzaOrder {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		pizza1.customizeOrder("large", 2, 3);
		pizza2.customizeOrder("small", 2, 1);
		pizza3.customizeOrder("medium", 3, 2);
		
		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println(pizza3);
		
		System.out.println("----------------------------------------------------");
		// order 159 pizza: medium, 2, 3
		
		
		
	}
	
}

/*
total number of pizza: 3
	
	1st Pizza: 
			size: Large
			cheese: 2
			pepproni: 3
			
	2nd Pizza:
			size: small
			cheese: 2
			pepproni: 1
			
	3rd Pizza:
			size: Medium
			cheese: 3
			pepproni: 2

*/
