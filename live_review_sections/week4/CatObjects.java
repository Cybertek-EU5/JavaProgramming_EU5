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
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		
		
		
		
	}

}
