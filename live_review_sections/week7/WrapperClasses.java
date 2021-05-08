package week7;

public class WrapperClasses {
	
	public static void main(String[] args) {
		/*
		 Byte, Short, Integer, Long, Float, Double, Character, Boolean
		 */
		
		int a = 10;
		long l1 = a;
		//Long l2 = a;  // wrapper class is only dedicated to its own primitive
		
		byte b = 20;
		short s1 = b;
		// Short s2 = b;
		
		Byte n = 10;
		short s3 =n;
		
		System.out.println("--------------------------");
		
		double  m = 2.5;
		Double d1 = m;  //auto-boxing
		
		Double d2 = 10.5;
		double p = d2;  // un-boxing
		
		Double d3 = d2; 
		
		double r = p;
		
		System.out.println("-------------------------------");
		String str = "12";
		
		
		System.out.println( str + 1);
		System.out.println(Integer.parseInt(str) + 1);  // int
		System.out.println(Integer.valueOf(str) + 1);  // Integer
		
		
		
		
		
	}

}
