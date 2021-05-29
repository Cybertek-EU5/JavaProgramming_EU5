package week10;

public class StaticPractice2 {
	
	static {
		System.out.println("Hello Cybertek");
	}
	
	
	int a;
	static int b;
	
	public static void main(String[] args) {
	
		System.out.println("Hello World");
		
		System.out.println("---------------------");
		
		StaticPractice2 obj1 = new StaticPractice2();
			obj1.a = 10;
			obj1.b = 100;
				
		StaticPractice2 obj2 = new StaticPractice2();
			obj2.a=20;
			obj2.b = 200;
			
			
			System.out.println(obj1.a); // 10
			System.out.println(obj2.a); // 20
			
			System.out.println(obj1.b); // 200
			System.out.println(obj2.b); //200
		
		
		
		
	}
	

}
