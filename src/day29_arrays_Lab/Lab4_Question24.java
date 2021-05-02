package day29_arrays_Lab;

public class Lab4_Question24 {

	public static void main(String[] args) {
		
		int[] x = {1,2,1,3};
		int a = 2;
		
		System.out.println(isEverywhere(x, a));

	}
	
	public static boolean isEverywhere(int[] arr,int number) {
		
		for(int i=0;i<arr.length-2;i++) {
			
			if(arr[i]==number && (arr[i+1]==number || arr[i+2]==number)) {
				return true;
			}
		}
		
		return false;
		
		
		
		
	}

}
