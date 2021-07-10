package week14;

import java.io.FileInputStream;

public class ExceptionHandlings_Throws {
	
	
	public static void main(String[] args) throws RuntimeException {
		
		System.out.println(10/0);
		
		System.out.println("Test 1 Completed");
		
		
	//	method1();
		
	}
	
	
	
	
	public static void method1() throws InterruptedException{
		
		Thread.sleep(3000);
		
		
	}
	
	
	public static void method2() throws InterruptedException {
		method1();
	}
	
	
	public static void method3() {
		
		try {
			method2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void method4() {
		method3();
	}
	
	
	public static void method5() throws Exception {
		
		Thread.sleep(1000);
		
		System.out.println("Step 2");
		
		new FileInputStream("");
		
		System.out.println("Test Completed");
		
	}
	
	
	public static void method6() {
	//	method5();
	}
	
	
	

}
