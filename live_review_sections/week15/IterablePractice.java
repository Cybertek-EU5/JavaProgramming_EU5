package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterablePractice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.addAll(  Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6));
		
		System.out.println(list);
		
		for(int i =0; i < list.size(); i++) {
			if( list.get(i) < 5 ) {
				list.remove(i);
			}
		}
		
		System.out.println(list);
		
		System.out.println("-------------------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(  Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6));
		
		System.out.println(list2);
		
		Iterator<Integer> it = list2.iterator();
		
		while(it.hasNext()) {
			
			if( it.next() < 5) {
				it.remove();
			}
			
		}
		
		System.out.println(list2);
		
	System.out.println("---------------------------------");	
	ArrayList<Integer> list3 = new ArrayList<>();
	list3.addAll(  Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6));
	
	System.out.println(list3);
	
	list3.removeIf( p ->  p < 5);  // internally using iterable
	
	System.out.println(list3);
		
		
		
		
	}
	

}
