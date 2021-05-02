package day29_arrays_Lab;

public class Lab4_Question21 {

	public static void main(String[] args) {
		
		int[] x = {2,3,2,2,2,4};
		
		System.out.println(sum28(x));
		
	}
	
	public static boolean sum28(int[] arr) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] ==2) {
				
				sum = sum + arr[i];
			}
		}
		
		if(sum == 8 ) {
			return true;
		}
		
		return false;
		
	}

}
