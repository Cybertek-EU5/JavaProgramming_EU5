package week4;

public class CatObjects {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = "Luna";
		cat1.age = 1;
		cat1.breed = "mixed";
		cat1.color = "black";
		cat1.size = "small";
		
		Cat cat2 = new Cat();
		cat2.setInfo("Mayko", 19, "scottish", "red","large" );
		
		Cat cat3 = new Cat();
		cat3.setInfo("Bruce", 1, "persian", "black", "small");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		cat1.sleep();
		cat2.eats("fish");
		cat3.drinks("milk");
		
		
		
		
		
	}

}
