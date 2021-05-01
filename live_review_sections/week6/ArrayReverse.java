package week6;

import java.util.Arrays;

import utilities.ArraysUtility;

public class ArrayReverse {
	
	public static void main(String[] args) {
		int[] array = {10,20,30,40, 50, 60, 70, 80};
		int[] result =	new int[array.length]; // {40,30,20,10}
		
		/*
		       i          j           
		result[0] = array[3];  // 40
		result[1] = array[2]; // 30
		result[2] = array[1]; //20
		result[3] = array[0]; // 10
		
		result[i] = array[j]
		*/
		
		for(int i=0, j = array.length -1;  i < result.length ; i++, j-- ) {
			result[i] = array[j];
		}
		
		
		System.out.println(Arrays.toString(result));
		
		System.out.println("-------------------------------");
		
		int[] a1 = {90, 100, 110, 120, 130};
		
		a1 = ArraysUtility.reverse(a1);
		
		System.out.println(Arrays.toString(a1));
		
		
		
		
		
		
	}

}
