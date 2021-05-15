package week8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {
	
	public static void main(String[] args) {
		//{10, 20, 10, 20, 10, 20,10, 20}
		int[] numbers = {10, 20, 10, 20, 10, 20,10, 20};
							
		ArrayList<Integer> list = new ArrayList<>()	;  //[10,20]		
		
		
		for(int each  : numbers) {
			
			/*
			if(list.contains(each)) {
				continue;
			}
			list.add(each);
			*/
			if(!list.contains(each)) {
					list.add(each);
			}
		}
		
		
		System.out.println(list);
		
		System.out.println("--------------------------------------------");
		
		ArrayList<String> names = new ArrayList<>();
		names.addAll(  Arrays.asList( "Zeziha", "Akhtam", "Ahmet" )  );
		
		names.set(1, "Yasin");
		names.add(1, "Zina");
		System.out.println(names);
		System.out.println(names.get(1));
		
		
		
		
		
		
	}

}
