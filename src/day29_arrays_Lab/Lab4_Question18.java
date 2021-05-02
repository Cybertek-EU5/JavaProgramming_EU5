package day29_arrays_Lab;

public class Lab4_Question18 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2,1,3,13,3};
		
		int sum = 0;
		
		for(int i=0;i<x.length;i++) {
			
			if(x[i] != 13) {
				sum=sum+x[i];
			}else {
				break;
				
			}
		}
		
		System.out.println(sum);
	}

}
