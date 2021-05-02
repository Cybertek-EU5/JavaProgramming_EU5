package day30_wrapperClass;

public class Boxing {

	public static void main(String[] args) {
		
		//AUTOBOXING - > primitive to object
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		//UNBOXING - > object to primitive
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1:" + d1);
		System.out.println("d2:" + d2);
		
		long l1 = new Long(6000000L); //unboxing
		Long l2 = new Long(345699459); //no Boxing
		
		long l3 = l2; //unboxing
		
		
		int x =345;
		double y = x;
		
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3; //casting not possible with wrapper classes
		

		


	}

}
