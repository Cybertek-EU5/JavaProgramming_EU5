package week1;

public class PrimitivesReview {
	
	/*
	 primitives: byte, short, int, long, float, double
	 			 char, boolean
	 			 
	 			 byte < short < int < long < float < double
	 			 
	 			 smaller primitive can be assigned to larger
	 */
	
	public static void main(String[] args) {
		/*
		 print salary in 4 different lines
		 */
		
		System.out.println(80000);
		System.out.println(80000);
		System.out.println(80000);
		System.out.println(80000);
		
		System.out.println("----------------------------------------");
		
		/*
		 Variable:
		 		DataType name = Value;
		 */
		
		int salary = 80000;
		
		System.out.println(salary);
		System.out.println(salary);
		System.out.println(salary);
		System.out.println(salary);
		
		
		System.out.println("--------------------------------------");
		double  rate = 0.5;
		double d1 = 123;  //123.0, implicit casting
		//		    (double)int  ==> decimal
		System.out.println(d1);
		
		
		System.out.println("----------------------------------------");
		
		char ch1 = 45000;  // only takes the character
		char ch2 = '%';
		char ch3 = 'Z';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char c1 = 65; //'A'
		char c2 = '$'; // 36
		
		System.out.println( c1 + c2);
		//					65 + 36 = 101
		
		
		System.out.println("----------------------------------");
		
		boolean isEmployeed = true;
		boolean isMarried = false;
		boolean r1 = 10 < 8;
		boolean r2 = 11 > 10;
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("-----------------------------------------");
		
		String name = "Muhtar";
		
		
		/*
		float salary = 70000;  // implicit casting
		long number = 99999999999L;
		float f = number;
		long l = (long)f;  // explicit casting
		*/
		
		
		
		
	}
	
	

}
