package day17_classObjects_Part2;

public class CarObjects {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		BMW b2 = new BMW();
		
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.make = "BMW2019";
		System.out.println(b1.make);
		
		System.out.println(b2.make);
		
		System.out.println(b1.model);
		b1.model="m3";
		b1.showPrice();
		
		b2.model="X3";
		b2.showPrice();
		
		
		
		
	}

}
