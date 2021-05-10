package day33_ClassObjects_Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(); 
		
		r1.length=5.2;
		r1.width=4.8;

		
		
		Rectangle r2 = new Rectangle();
		r2.length=3.5;
		r2.width=2.7;
		
		
		System.out.println(r1.length); 
		System.out.println(r2.width);

	}

}
