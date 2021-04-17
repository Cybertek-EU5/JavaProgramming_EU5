package week4;

public class GarbageCollection {
	
	public static void main(String[] args) {
		
		String str = "Apple";
			   str = "Samsung"; // after line 8, "Apple" is unreferenced
		
		System.out.println(str);
		System.out.println(str);
		
		str = null;  // 2 objects in total are eligible for garbage collection
		
		System.out.println(str);
		
		
		
	}

}
