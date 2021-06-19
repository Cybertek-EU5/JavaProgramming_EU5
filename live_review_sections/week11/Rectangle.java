package week11;

import java.text.DecimalFormat;

public final class Rectangle extends Shape{
	
	public double width, length;

	public Rectangle( double width, double length) {
		super("Rectangle");
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return width * length;
	}

	@Override
	public double perimeter() {
		return (width+length)*2;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");

		return "Rectangle [width= " + width 
				+ ", length= " + length 
				+ ", area= " + df.format( area() )
				+ ", perimeter= " + df.format( perimeter() ) + "]";
	}

	
	
	
		

}
