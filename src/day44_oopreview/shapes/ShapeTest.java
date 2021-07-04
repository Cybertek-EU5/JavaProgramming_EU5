package day44_oopreview.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		//create 3 shapes, using polymorphis
		
		Shape square = new Square();
		Shape diamond = new Diamond();
		Object shapeObject = new Shape();
		
		square.draw();
		diamond.draw();
		
		((Square)square).squareMethod();
		
		
		
		
		

	}

}
