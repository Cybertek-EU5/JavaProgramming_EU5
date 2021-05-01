package week6;

import utilities.MathUtility;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < array.length; i++) { // we have access to the indexes
			System.out.println(array[i]);
		}

		System.out.println("----------------------------");

		for (int each : array) { // we only have access to the elements
			System.out.println(each);
		}

		System.out.println("---------------------------");

		int[] numbers = { 10, 5, 6, 20, 30 };
		int max = numbers[0];
		int min = numbers[0];

		for (int each : numbers) {
			max = MathUtility.max(each, max);
			min = MathUtility.min(each, min);
		}
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("-------------------------------------");
		
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80};
		int sum =0; // 10 + 20 +30.... +80
		
		for (int each : nums) {
			sum += each;
		}
		
		
		
		System.out.println("Sum: "+sum);
		System.out.println("Average: " + (sum/nums.length));

	}

}
