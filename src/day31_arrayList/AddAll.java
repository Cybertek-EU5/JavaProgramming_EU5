package day31_arrayList;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Java");
		l1.add("JS");
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("C#");
		l2.add("C++");
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		l2.addAll(l1);
		System.out.println(l2.toString());
		
		l1.addAll(l2);
		System.out.println(l1.toString());
		
		

		
	}

}
