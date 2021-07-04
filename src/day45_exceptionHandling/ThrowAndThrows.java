package day45_exceptionHandling;

public class ThrowAndThrows {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		//throw new RuntimeException("This is some exception");
		
		try {
			throw new Exception("Another exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String username="";
		
		if(username.isEmpty()) {
			throw new RuntimeException("User name can not be empty");
		}else {
			System.out.println("Valid user name");
		}
		
		try {
			sleep3(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
	}
	
	public static void sleep3(int seconds) throws InterruptedException {
		sleep2(seconds);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
