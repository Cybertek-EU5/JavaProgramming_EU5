package day29_arrays_Lab;

public class Lab4_Question22 {

	public static void main(String[] args) {
		
		int[] x = {1,1,4,4,4};
		System.out.println(more14(x));
	}
	
	public static boolean more14(int[] arr) {
		
		int counter1 = 0;
		int counter4 = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				counter1++;
			}else if(arr[i] == 4) {
				counter4++;
			}
		}
		
		if(counter1>counter4) {
			return true;
		}
		
		return false;
		
	}

}
