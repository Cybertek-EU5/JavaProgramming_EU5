package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question6 {

	public static void main(String[] args) {
		
		int[] x = {1,20,3,0,0,0,0,0,0,0,125};
		
		System.out.println(Arrays.toString(maxEnd(x)));

	}
	
	public static int[] maxEnd(int[] arr) {
		
		int max = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]>max) {
				
				max = arr[i+1];
				
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = max;
		}
		
		return arr;
	}

}
