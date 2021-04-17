package week4;

public class StringPractice2 {
	
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = new String("Java");
		
		String s4 = "java";
		
		System.out.println(s1 == s2); // false, different memory location
		
		System.out.println(s1.equals(s2)); // true, different objects, but same visible text
		
		System.out.println(s2.equals(s3)); // true, different objects, but same visible text
		
		System.out.println(s1 == s4); // false, case sensitive
		System.out.println(s1.equals(s4));  // false, case sensitive
		
		System.out.println(s1.equalsIgnoreCase(s4)); // true, ignores case sensitivity
		
		
	}

}
