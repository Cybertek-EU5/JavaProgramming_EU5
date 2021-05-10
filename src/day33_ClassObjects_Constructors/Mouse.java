package day33_ClassObjects_Constructors;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	//1
	public Mouse(int weight) {  //i want to call constructor 2
		this(30,weight);
		this.weight = weight;
		System.out.println("Java");
	}

	//2
	public Mouse(int numTeeth, int weight) { //i want to call constructor 3
		this(numTeeth,20,weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}
	

	//3
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("TS");
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
	
	
	
	
	
	
	

}
