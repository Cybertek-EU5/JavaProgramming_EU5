package week6;

import java.util.Arrays;

public class MultiDimensionalArrays {
	
	public static void main(String[] args) {
		//n dimensional array contains (n-1) dimensional array
		
		int[] a1 = {10,20};
		
		int[][] arr2D = { {10, 20}, {40, 60},  {100, 120, 130}   };
		//				     0,       1,           2
		
		System.out.println(arr2D.length);
		
		System.out.println( Arrays.deepToString(arr2D) );
		System.out.println( Arrays.toString(arr2D[2]) );
		System.out.println( arr2D[2][2] );
		
		System.out.println("----------------------------------------");
		String[] group1 = {"Serap", "Akhtam"};
		String[] group2 = {"Neziha", "Bunyamin"};
		String[] group3 = {"Rustem", "harun"};
		//					 0          1
		
		
		String[][] groups = { group1, group2, group3 };
		//		i			    0       1        2
		
		// Rustem
		//System.out.println(groups[2][0]);
		
		
		// print each group:
		for(int i = 0; i < groups.length; i++) { //i: represents the index of 1 arrays
			String[] eachGroup	= groups[i];
			System.out.println(Arrays.toString(eachGroup ));
			
			for(int j=0; j < eachGroup.length; j++) { //j: represents the index numbers of elements
				String eachMember = eachGroup[j];
				System.out.println(eachMember);
			}
			
		}
		
		
		
		
		
		
	}

}
