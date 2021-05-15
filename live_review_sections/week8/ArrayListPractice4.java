package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice4 {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();	
		list.addAll(  Arrays.asList('D', 'B', 'C','A', 'A','A') );
		
		Collections.sort(list); // sorts in ascending order
		System.out.println(list);
		
		Collections.swap(list,  list.size()-1, 0 );
		
		System.out.println(list);
		
		Collections.replaceAll(list, 'A', 'E');
		System.out.println(list);
		
		
		
		
	}

}
