package day28_arrays_Lab;

public class Lab4_Question4 {

	public static void main(String[] args) {
		
		
		int[] x = {1,2,3};
		
		int[] y = {-4,2,0};
		
		int a = sum(x);
		System.out.println(a);
		
		System.out.println(sum(y));
		
		

	}
	
	public static int sum(int[] arr) {
		
		int sum = 0;
		
		for(int value :arr ) {
			
			sum = sum + value;
			
			
		}
		
		return sum; //7
		
		
	}

}
