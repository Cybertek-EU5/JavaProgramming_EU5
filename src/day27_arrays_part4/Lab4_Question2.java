package day27_arrays_part4;

public class Lab4_Question2 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		
		System.out.println(sameFirstLast(x));
		System.out.println(sameFirstLast(y));
		System.out.println(sameFirstLast(z));
		System.out.println(sameFirstLast(k));
			

	}
	
	public static String sameFirstLast(int[] arr) {
		
		if(!(arr.length>1)) {
			return "not a valid array";
		}
		
		if(arr[0] == arr[arr.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
	}

}
