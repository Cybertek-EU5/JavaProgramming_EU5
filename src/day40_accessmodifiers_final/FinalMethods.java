package day40_accessmodifiers_final;

public class FinalMethods {
	
	public final void method1() {
		System.out.println("Method-1");
		
		String x = "Apple";
	}
	
	public final static void staticMethod(String word) {
		System.out.println("Static Method");
	}
	
}


class Sub extends FinalMethods{
	
	/*
		public void method1() {
			System.out.println("Method-1 in subclass");
		}
		
		public static void staticMethod(String word) {
			System.out.println("Static Method in Sub Class");
		}
	*/
	
}
