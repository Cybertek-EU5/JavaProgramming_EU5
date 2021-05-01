package week6;

import java.util.Arrays;
import java.util.Random;

import utilities.ArraysUtility;

public class RandomClass {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] array = new int[5]; 
		
		for (int i = 0; i < array.length; i++) {
			array[i]=random.nextInt(100);
		}
				
		System.out.println( Arrays.toString(array));
		
		System.out.println("------------------------------------------");
		
		int[] numbers = {10, 5, 6, 7, 20};
		
		int max = numbers[0]; // 20
		
		for(int i = 1; i < numbers.length; i++) { // numbers[i]: 5, 6, 7, 20
			
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		
		System.out.println("Max: "+max);
		
		System.out.println("---------------------------------------");
		int[] a1 = {100,200,30,40};
		int max1 = ArraysUtility.max(a1);
		int min1 = ArraysUtility.min(a1);
		System.out.println("Max: "+max1);
		
		System.out.println("Min: "+min1);
		
		
		double[] a2 = {2.5, 4.5, 1.5, 0.5};
		double max2 = ArraysUtility.max(a2);
		double min2 =  ArraysUtility.min(a2);
		
		System.out.println(max2);
		System.out.println(min2);
		
		
	}

}
