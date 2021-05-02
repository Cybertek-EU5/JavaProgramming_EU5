package day27_arrays_part4;

public class Lab4_Question3 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {7,3};
		
		System.out.println(commonEnd(a, b));

	}
	
	public static String commonEnd(int[] x, int[] y) {
		
		if(!(x.length>1)) {
			return "Array 1 is not valid";
		}
		if(!(y.length>1)) {
			return "Array 2 is not valid";
		}
		
		
		if(x[0]==y[0] || x[x.length-1]==y[y.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
	}

}
