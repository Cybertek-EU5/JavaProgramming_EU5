package week8;

public class Item {
	
	public String name;
	public double price;
	public int quantity;
	
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double calCost() {
		return price * quantity;
	}

	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}