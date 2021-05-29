package week10;

import java.util.ArrayList;

public class StaticPractices {
	
	static class Hello{
		
	}
	
	String name;
	
	
	public StaticPractices(String name) {
		this.name = name;
	}
	
	
	
	
	static int b=10;
	static String str = "";
	
	static ArrayList<String> names ;
	
	static {
	
		names = new ArrayList<>();
		names.add("Muhtar");
	}
	
	
	
	/*
	 static ExcelSheet sheet;
	 		read the excel file
	 		get the name of sheet
	 		get every cell
	 */
	
	
	
	/*
	public static void printName() {
	//	System.out.println(name);
	//	System.out.println(this.name);
		
	//	System.out.println( new StaticPractices().name );
		
	}
	*/
	
	public void printName() {
		System.out.println(name);
		System.out.println(b);
	}
	
	
	

}
