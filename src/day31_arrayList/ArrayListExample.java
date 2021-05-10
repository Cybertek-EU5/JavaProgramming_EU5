package day31_arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//Languages
		//Print size arrayList
		//read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("English");
		languages.add("Arabic");
		languages.add("Turkish");
		
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());
		
		languages.add("Russian");
		System.out.println(languages.toString());
		
		languages.remove(0);
		System.out.println(languages.toString());
		
		System.out.println("Number of values: " + languages.size());
		
		

	}

}
