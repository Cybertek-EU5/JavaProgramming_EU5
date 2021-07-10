package week14;

public class ExceptionHandlings_TryCatch {
	
	public static void main(String[] args) {
		
		try {
			System.out.println( 10/0 ); // exception object will be created
		}catch(ArithmeticException e) {
			//System.out.println( e.getMessage() );
		   //	e.printStackTrace();
		}
		

		try {
			System.out.println("Hello");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Test 1 Completed");
		
		
		
		
		
		// 
		
		
		
		
	}

}
