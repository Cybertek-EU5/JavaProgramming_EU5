package week11;

public class Circle extends Shape {
	
	public double radius;
	
	public final static double PI;
	
	static {
		PI = 3.14;
	}
	
	public Circle(double radius){
		 super("Circle");
		 this.radius = radius;
		
	}
	
	@Override
	public double area() {
		return radius * radius * PI;
	}
	
	@Override
	public double perimeter() {
		return radius*2 * PI;
	}
	
	
	

}





