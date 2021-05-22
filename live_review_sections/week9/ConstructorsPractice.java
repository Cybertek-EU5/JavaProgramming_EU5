package week9;

public class ConstructorsPractice {
	
	public ConstructorsPractice(){
		//this(10);
		System.out.println("a");
	}

	
	public ConstructorsPractice(int a) {
		this(); // a
		System.out.println("b");
		
	}
	
	public ConstructorsPractice(String a) {
		this();
	//	this(20);
		System.out.println("b");
		
	}
	
	
	public static void main(String[] args) {
		
		new ConstructorsPractice(10);
		
	}
	
	
	
	
	
	
	
	public void method1() {
		method1() ;
		System.out.println("A");
	}
	
	public void method2() {
		//ConstructorsPractice();
		method1();
		System.out.println("B");
	}
	
	public void method3() {
		method1();
		method2();
		System.out.println("C");
	}

}
