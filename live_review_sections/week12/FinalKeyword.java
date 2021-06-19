package week12;


final class Test{
	
	protected final void method() {
		System.out.println("Good Morning");
	}
	
}


public class FinalKeyword extends Test {
	
	/*
	@Override
	public void method() {
		System.out.println("Good Evening");
	}
	*/
	
	
	final int b; // needs to be initialized before we use 
	final static int c;
	
	
	public FinalKeyword(int b) {
		this.b = b;
	}
	
	
	static {
		c= 200;
	}
	
	public final static void main(String[] args) {
		final int a ;
		a = 100;
		//a= 200;
		System.out.println(a);
		
		final String dateOfBirth = "May/20/1990";
	//	dateOfBirth =  "Jun/20/1990";
		
		final char gender = 'M';
		// gender = 'F';
		
		final String DATE_OF_BIRTH = "Jun/20/1990";
		
		int min = Integer.MIN_VALUE;
		
		//int d = new int[4].length;
		
		
		
	}

}
