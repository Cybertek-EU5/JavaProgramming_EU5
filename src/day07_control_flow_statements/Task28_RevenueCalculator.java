package day07_control_flow_statements;

public class Task28_RevenueCalculator {

	public static void main(String[] args) {
		
		double price = 19.99;
		int quantity =  2000;
		
		double revenue;
		double discount=0;
		
		revenue=price*quantity;
		
		if(revenue>5000) {
			
			discount = revenue*0.1;
			revenue=revenue-discount;
		}
		
		System.out.println("discount = " + discount);
		System.out.println("revenue = " + revenue);

	}

}
