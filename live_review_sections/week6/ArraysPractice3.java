package week6;

import java.util.Arrays;

public class ArraysPractice3 {
	
	public static void main(String[] args) {
		
		char[][] arr2D = { {'A','B', 'C'}, {'D','E'}, {'F', 'G', 'H', 'I'}  };
		//					   0              1                 2	
		
		for(char[] each1D   : arr2D ) {
			//System.out.println(Arrays.toString(each1D));
			for(char eachElement  : each1D) {
				System.out.println(eachElement);
			}
			
		}
		
		System.out.println("----------------------------------");
		int[][] arr2D_1 = {{1,2}, {3,4,5}};
		int[][] arr2D_2 = {{6,7,8,9,10}, {11,12,13} };
		
		int[][][] arr3D = {  {{1,2}, {3,4,5}} ,   {{6,7,8,9,10}, {11,12,13} }   };
		//						     0							1
		
		System.out.println(Arrays.deepToString(arr3D));
		
		
		// {{6,7,8,9,10}, {11,12,13} } 
		System.out.println( Arrays.deepToString(arr3D[1]) );
		// {6,7,8,9,10}
		System.out.println(  Arrays.toString(arr3D[1][0]) );
		//9
		System.out.println(arr3D[1][0][3]);
		System.out.println("-----------------------------------------------");
		
		for(int[][] each2D : arr3D ) {
			for(int[] each1D : each2D) {
				for(int each : each1D) {
					System.out.println(each);
				}
			}
		}
		
		
		System.out.println("---------------------------------------");
		int[][][][]  arr4D = { 
				{  {{1,2}, {3,4,5}} ,   {{6,7,8,9,10}, {11,12,13} }   },
				{  {{10,20}, {30,40,50}} ,   {{60,70,80,90,100}, {110,120,130} } }
		};
		
		for( int[][][] each3D : arr4D) {
			for(int[][] each2D : each3D) {
				for(int[] each1D: each2D) {
					for(int eachElement: each1D) {
						System.out.println(eachElement);
					}
				}
			}
		}
		
		
		
	}

}
