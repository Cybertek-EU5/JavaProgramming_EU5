package day31_arrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		
		nums.remove(5); //removes the spficied index number from the list
		

		
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5); //Converting primitive to object
		Integer n2 = Integer.valueOf(5);
		
		nums.remove(n1);  //removes the specified element from the list
		
		System.out.println(nums.toString());
		
		nums.remove(new Integer(4));  //removes the specified element from the list
		
		System.out.println(nums.toString());
		
		
	}

}
