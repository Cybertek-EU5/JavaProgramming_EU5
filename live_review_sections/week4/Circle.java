package week4;

public class Circle {

	public double radius;  //attribute radius
	
	public double calculateArea() {  // action to calculate area
		return radius * radius * 3.14;
	}
	
	
	public double calculatePerimeter() { //action to calculate perimeter
		return radius * 2 * 3.14;
	}
	
	public String toString() { // convert circle to string
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