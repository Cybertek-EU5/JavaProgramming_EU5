package day28_arrays_Lab;

public class Lab4_Question12 {

	public static void main(String[] args) {
		
		int[] x = {0,2,3};
		int[] y = {1,3};
		
		System.out.println(start1(x,y));
		

	}
	
	public static int start1(int[] arr1,int[] arr2) {
		
		int counter = 0;
		
		if(arr1[0] == 1) {
			counter++;
		}
		if(arr2[0] == 1) {
			counter++;
		}
		
		return counter;
		
	}

}
