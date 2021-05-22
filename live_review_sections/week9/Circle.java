package week9;

public class Circle {
	
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
	}
	
	
	

}
