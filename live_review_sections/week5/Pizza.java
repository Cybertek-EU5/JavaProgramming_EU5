package week5;

public class Pizza {
	
	public String size;
	public int cheeseTopping;
	public int pepperoniTopping;
	
	public void customizeOrder(String pizzaSize, int cheese, int pepperoni) {
		size = pizzaSize;
		cheeseTopping = cheese;
		pepperoniTopping = pepperoni;
	} // helps us to set the attributes of Pizza
	
	public double calculatePrice() {
		int startingPrice = (size.equals("small"))? 10 
				:(size.equals("medium")) ? 12 : 14;
		
		int totalPriceOfCheese = 1 * cheeseTopping;
		int totalPriceOfPepproni = 2 * pepperoniTopping;
		
		return startingPrice + totalPriceOfCheese + totalPriceOfPepproni;
	} // returns the total price of the pizza

	
	public String toString() {
		return "Pizza [size=" + size 
				+ ", cheeseTopping=" + cheeseTopping 
				+ ", pepperoniTopping=" + pepperoniTopping
				+", total price=$"+calculatePrice() + "]";
	}
	
	
	
	
	

}
/*
Pizza:
            attribute:
                size
                cheeseTopping
                pepperoniTopping

            Actions:
                setInfo(), calculatePrice(), toString()
                assume that:
                    size:
                        small ==> $10
                        medium ==> $12
                        large ==> $14

                    one cheese topping 1$
                    one pepperoni topping 2$
*/