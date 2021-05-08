package week7;

import java.util.Arrays;

import utilities.ArraysUtility;

public class AddElementToArray {
	
	public static void main(String[] args) {
		int[] numbers = {10, 20, 5, 30, 40, 5, 1, 2, 3, 4, 5};
		int max = ArraysUtility.max(numbers);
		
		System.out.println("------------------------------");
		
		int[] arr = {1,2,3};
		int element = 4;
		
		 int[] newArray = new int[arr.length + 1]; // {1,2,3,4}
		 int i = 0; 
		 for (int each : arr) {
			 newArray[i++]= each;
		 }
		 
		 newArray[i] = element;
		 
		 
		 
		 System.out.println( Arrays.toString(  newArray ) );
		 
		 System.out.println("--------------------------------------------");
		 
		 int[] nums = {10, 20, 30, 40};
		   nums = addElement(nums, 50);
		   
		   System.out.println(Arrays.toString(nums));
		   
		   System.out.println("----------------------------");
		 
		 int[] n = {100, 200, 300, 400}; 
		 
		 System.out.println(Arrays.toString(n));
		 
		 n =  addElement(  addElement( addElement(n, 500), 600 ) , 700);
		 
		 System.out.println(Arrays.toString(n));
	
		
	}
	
	public static  int[] addElement(int[] arr, int element) {
		int[] newArray = new int[arr.length + 1]; // {1,2,3,4}
		 int i = 0; 
		 for (int each : arr) {
			 newArray[i++]= each;
		 }
		 
		 newArray[i] = element;
		 return newArray;
	}
	
	
	
	
	
	
	

}
