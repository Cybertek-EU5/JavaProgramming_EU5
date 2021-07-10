package week14;

import java.io.FileInputStream;
import java.util.Arrays;

public class ExceptionsPractice {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println( Arrays.toString( new int[] {1,2,3}  )  );
		
		// System.out.println( new int[] {1,2,3}[100]   );  // index out of bounds exception
								//     0 1 2
		
	//	System.out.println(  100 / 0 ); //ArithmeticException
		
		
	//	FileInputStream file = new FileInputStream("");  // checked exception: FileNotFoundException
 
	//	Thread.sleep(1000); // checked exception
		
		
	}
	

}
