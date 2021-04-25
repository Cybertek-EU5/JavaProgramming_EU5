package day25_arrays_part2;

public class SameArray {

	public static void main(String[] args) {
		
		int[] array1 = {2,4,6,8,10};
		
		int[] array2 = array1;
		
		array1[0] = 200;
		
		array2[4] = 1000;
		
		System.out.println("The contencts of array1:");
		
		for(int value : array1) {
			System.out.println(value);
		}
		
		System.out.println();
		
		System.out.println("The contencts of array2:");
		
		for(int value : array2) {
			System.out.println(value);
		}
		
		int[] numbers = {20,0,0,30,0,0};
		
		

	}

}
