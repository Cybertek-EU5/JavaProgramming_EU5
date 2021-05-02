package day29_arrays_Lab;

public class Lab4_Question19 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2,6,99,99,3};
		
		int sum = 0;
		boolean boolCheckSix = false;
		
		for(int i=0;i<x.length;i++) {
			
			if(boolCheckSix) {
				
				if(x[i] == 7 ) {
					
					boolCheckSix = false;
				}
				
				
			}else if(x[i] == 6) {
				
				boolCheckSix = true;
				
			}else {
				
				sum = sum + x[i];
				
				
			}
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		}

	}


