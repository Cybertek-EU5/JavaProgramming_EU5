package day42_interface;

public class ElectricCarTest {

	public static void main(String[] args) {
		
		//ElectricCar ec = new ElectricCar(); ERROR- can not be instantiated
		
		Tesla modelS = new Tesla("Model S", 45000, "White");
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop();
		
		System.out.println("===========");
		
		Ford fusion = new Ford("Fusion", 30000, "Black", 2017);
		fusion.charge();
		fusion.start();
		fusion.drive();
		fusion.stop();
		
		System.out.println("===========");
		
		TeslaSemi semi = new TeslaSemi("Semi", 50000, "Brown", 3.5);
		semi.charge();
		semi.start();
		semi.load("Oranges");
		semi.drive();
		semi.stop();
		
		System.out.println("===========");
		
		TeslaTruck truck = new TeslaTruck("CyberTruck", 100000, "White", 6.5);
		truck.charge();
		truck.start();
		truck.load("Java Books");
		truck.drive();
		truck.stop();
		
		System.out.println("===========");
		System.out.println(modelS.toString());
		System.out.println(fusion.toString());
		System.out.println(semi.toString());
		System.out.println(truck.toString());

	}

}
