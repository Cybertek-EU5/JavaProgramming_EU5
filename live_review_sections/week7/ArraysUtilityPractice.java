package week7;

import java.util.Arrays;

import utilities.ArraysUtility;

public class ArraysUtilityPractice {
	public static void main(String[] args) {
		
		int[] numbers = {10, 5, 4, 3, 20, 50, 60, 70, 0, 100};
		
		Arrays.sort(numbers);
		numbers = ArraysUtility.reverse(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("--------------------------------");
		String[] group = {"Zeynep", "Zina", "Ahmet", "Yasin"," Baki","Mahmut", "Savas"};
		
		String student1 = "Ferhat";
		String student2 = "Ahmet";
		String student3 = "Bunyamin";
		
		group =	ArraysUtility.addElement ( ArraysUtility.addElement(group, student1), student2);
		group = ArraysUtility.addElement(group, student3);
		
		System.out.println(Arrays.toString(group));
		
		
	}

}
