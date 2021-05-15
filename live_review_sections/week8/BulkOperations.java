package week8;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  list = new ArrayList<>();
		list.addAll( Arrays.asList(1,1,2,2,2,2,2,2,3,1,1,1,4,5,6,7,8,1,1,1,1,1));
		
		System.out.println(list);
		
		list.removeAll( Arrays.asList(1,2) );
		
		System.out.println(list);
		
		System.out.println("-----------------------------------------");
		ArrayList<Integer>  list2 = new ArrayList<>();
		list2.addAll(   Arrays.asList( 1,2,2,2,2,2,2,3,1,1,1,4,5,6,7,8,1,1,1,1 ) );
		
		System.out.println(list2);
		
		list2.retainAll( Arrays.asList(1,2));
		
		System.out.println(list2);
		
		System.out.println("-------------------------------------");
		
		ArrayList<String> employees = new ArrayList<>();
		employees.addAll( Arrays.asList("Ahmed", "John", "Daniel", "Ahmed","Jimmy","Ahmed", "Muhtar"));
		
		employees.removeAll( Arrays.asList("Ahmed") );
		
		System.out.println(employees);
		
		System.out.println("---------------------------------------");
		
		ArrayList<Integer>  nums = new ArrayList<>();
		nums.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,5,6,7,8,1,1,2,2,2,3,34,4,6,7,8,9,10));
		
		for(int i=0; i < nums.size(); i++) {
			if(nums.get(i)< 5) {
				nums.remove(i); //DO NOT use the remove method of arraylist in the loop
			}
		}
		
		
		System.out.println(nums);
		
		System.out.println("--------------------------------------------------------");
		ArrayList<Integer>  nums2 = new ArrayList<>();
		nums2.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,5,6,7,8,1,1,2,2,2,3,34,4,6,7,8,9,10));
		
		nums2.removeIf( each ->  each < 5 );
		
		System.out.println(nums2);
		
		
		
		
	}

}
