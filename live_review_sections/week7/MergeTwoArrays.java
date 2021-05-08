package week7;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6,7};
		
		
		int[] arr3 = new int[arr1.length + arr2.length];  //Make sure that this array can contain all the elements of arr1 & arr2
		int i = 0; // will represents the index numbers of third array
		
		for (int each : arr1) {
			  arr3[i++]=each;
		}
		
		for (int each : arr2) {
			arr3[i++] = each;
		}
		
		
		System.out.println( Arrays.toString( arr3) );
		
		
	}

}
