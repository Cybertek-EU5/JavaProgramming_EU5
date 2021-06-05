package week11;

import java.text.DecimalFormat;

public class Square extends Shape{
	
	public double side;

	public Square(double side) {
		super("Square");
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double perimeter() {
		return 4*side;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");

		return "Square [side= " + side 
				+ ", area= " + df.format( area() )
				+ ", perimeter)=" +  df.format( perimeter() ) + "]";
	}
	
	
	
	
	

}
