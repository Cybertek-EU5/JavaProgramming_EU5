package day25_arrays_part2;

import java.util.Arrays;

public class task92_TableArray {

	public static void main(String[] args) {
		
		int[]  numbers = new int[10];
		
		
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i] = i+1;
		}
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i] * 19);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		
		
		

	}

}
