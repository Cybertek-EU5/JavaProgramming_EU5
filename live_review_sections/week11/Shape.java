package week11;

import java.text.DecimalFormat;

public class Shape {
	
	
	public String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	
	public double area() {
		return 0;
	}
	
	public double perimeter() {
		return 0;
	}



	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		
		return "Shape [name= " + name + 
				", area= " +  df.format( area() ) + 
				", perimeter= " + df.format( perimeter() ) + "]";
	}
	
	
	
	
	
	
	

}


// circle , rectangle