package week11;

import java.text.DecimalFormat;

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

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Circle [radius= " + radius 
				+ ", area= " + df.format( area() )
				+ ", perimeter= " + df.format( perimeter() )+ "]";
	}
	
	
	
	
	

}





