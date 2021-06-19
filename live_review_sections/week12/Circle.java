package week12;

public final class Circle extends Shape {
	
	public double radius;
	public static final double PI = 3.14;
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * PI;
	}

	@Override
	public double perimeter() {
		return 2*radius*PI;
	}
	
	
	

}
