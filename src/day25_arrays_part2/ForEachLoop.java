package day25_arrays_part2;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] products = {"Timberland","Shirt","Watch","Bag","Shoes"};
		double [] prices = {120.0,12.99,300,25,67.89};
		
		for(int i=0;i<products.length;i++) {
			System.out.println(products[i]);
		}
		
		System.out.println("----------------------");
		
		for(String prod : products) {
			System.out.println(prod);
		}
		
		System.out.println("----------------------");
		
		for(double pr : prices) {
			System.out.println(pr);
		}
		
		System.out.println("----------------------");
		
		//print products in reverse order 
		for(int i=products.length-1;i>=0;i--) { 
			System.out.println(products[i]);
		}
		
		 
		
		

	}

}
