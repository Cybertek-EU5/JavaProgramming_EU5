package day28_arrays_Lab;

public class Lab4_Question8 {

	public static void main(String[] args) {
		
		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5};
		
		System.out.println(has23(x));
		System.out.println(has23(y));
		System.out.println(has23(z));
		

	}
	
	public static boolean has23(int[] arr) {
		
		for(int value : arr) {
			
			if(value==2 || value==3) {
				
				return true;
			}
			
		}
		
		return false;
	}

}
