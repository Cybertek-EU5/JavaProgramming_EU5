package week8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		int[] array = new int[5]; // fixed.  index: 0 ~ 4
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		//array[100] = 6;
		
		array[3] = 0;
		
		System.out.println(Arrays.toString(array));
		
		
		
		ArrayList<Integer> arrayList = new ArrayList<>(); // dynamic
		arrayList.add(1);  // 0
		arrayList.add(2);  // 1
		arrayList.add(3);  // 2
		arrayList.add(4);  // 3
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		
		arrayList.remove(3);
		
		System.out.println(arrayList);
		
		
		
		
		
	}

}
