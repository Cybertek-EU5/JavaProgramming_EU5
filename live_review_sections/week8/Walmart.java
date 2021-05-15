package week8;

public class Walmart {
	
	public static void main(String[] args) {
		
		Item[] items = {
				new Item("Toilet Papers", 2, 100),
				new Item("cucumbers", 1.59, 3),
				new Item("tomatoes", 1.99, 7),
                new Item("potatoes", 3.99, 500),
                new Item("shirt", 12.99, 3),
                new Item("TV", 200.99, 1),
		};
		
		double totalPriceBeforeTax = 0;
		int largestQuntity = 0;
		String nameOfItem = "";
		
		
		for (Item item : items) {
			totalPriceBeforeTax	+= item.calCost();
			if(item.quantity > largestQuntity) {
				largestQuntity = item.quantity;
				nameOfItem = item.name;
			}
		}
		
		System.out.println("total: $"+totalPriceBeforeTax);
		System.out.println(nameOfItem +" has the largest quqntity");
		
		
		
	}
	

}
