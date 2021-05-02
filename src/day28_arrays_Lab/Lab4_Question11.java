package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question11 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {2,0,5};
		int[] a = {11,2,13,2,3};
		
		System.out.println(Arrays.toString(fix23(x)));
		System.out.println(Arrays.toString(fix23(y)));
		System.out.println(Arrays.toString(fix23(a)));
		
		

	}
	
	public static int[] fix23(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2  && arr[i+1]==3) {
				
				arr[i+1]=0;
				
			}
		}
		
		return arr;
		
	}

}
