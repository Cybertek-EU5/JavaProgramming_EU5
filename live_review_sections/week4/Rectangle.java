package week4;

public class Rectangle {
	
	public double width, length;
	
	public double area() {
		return width * length;
	}
	
	public double perimeter() {
		return 2*(width+length);
	}

	
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", area= " +area()
		+", perimeter= "+perimeter()+"]";
	}

	

	

}
