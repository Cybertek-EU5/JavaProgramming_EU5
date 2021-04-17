package week4;

public class Circle {

	public double radius;
	
	public double calculateArea() {
		return radius * radius * 3.14;
	}
	
	
	public double calculatePerimeter() {
		return radius * 2 * 3.14;
	}
	
	public String toString() {
		return "Radius: "+radius
				+", Area: "+calculateArea()
				+", Perimeter: "+calculatePerimeter();
	}
	
}


/*
Circle:
			attributes:
				radius

			action/behaviors:
					area()
					perimeter()
*/