package week12;

public abstract class Shape { // not concrete
	
	public final String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract double area();
	
	public abstract double perimeter();

	@Override
	public String toString() {
		return "Shape [name= " + name + ", area= " + area() + ", perimeter= " + perimeter() + "]";
	}
	

}
