package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question15 {

	public static void main(String[] args) {
		
		
		int[] x = {8,6,7,9,5};
		
		System.out.println(Arrays.toString(swapEnds(x)));
		
		
	}
	
	
	public static int[] swapEnds(int[] arr) {
		
	
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		return arr;
		
	
	}
	
	

}
