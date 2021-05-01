package week6;

import java.util.Arrays;

public class ArraysPractice2 {
	public static void main(String[] args) {
		String str = "I love Java";
		
		String[] arr = str.split(" ");  //{I, love, Java}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------------------");
		
		String sentence = "Today is Saturday";
		// Saturday is Today
		
		String[] words = sentence.split(" "); // {Today, Is, Saturday}
		String result = "";
		
		for(int i = words.length-1; i >= 0; i--) {
			 result += words[i]+" ";
		}
		
		result =result.trim();
		System.out.println(result);
		
		System.out.println("-----------------------------------------");
		
		String school = "Cybertek School";
		
		char[] ch = school.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println("------------------------------------------");
		
		String[] names = {"Sergiu", "Serap", "Aysenur", "Aiden"};
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		int[] nums = {10, 5, 7, 20, 3, 2, 1};
		Arrays.sort(nums);  // ascending order
		System.out.println(Arrays.toString(nums));
		
		System.out.println("---------------------------------------------");

		// equals method
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		System.out.println(arr1 == arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		
		int[] arr3 = {3,1,2};
		System.out.println(Arrays.equals(arr2,  arr3));
		
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		System.out.println(Arrays.equals(arr2,  arr3));
		
		
		
		
		
	}

}
