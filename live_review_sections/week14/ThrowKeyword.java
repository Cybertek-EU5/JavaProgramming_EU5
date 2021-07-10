package week14;

public class ThrowKeyword {
	
	public static void main(String[] args) {
		
		
		String browser = "chrome";  // chrome, firefox, salari
		
		
		switch (browser) {
			case "chrome":
				System.out.println("Chrome Browser is selected");
				break;
				
			case "firefox":
				System.out.println("FireFox Browser is selected");
				break;
				
			case "safari":
				System.out.println("Safari Browser is selected");
				break;

		default:
			throw new RuntimeException("Invalid Browser Name");
		}
		
		
		
		
		
		System.out.println("Test Case started");
		
		try {
			throw new BreakTimeException("It's time for a short break");
			//throw new String("Hello");
		}catch(BreakTimeException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Test case 2 started");
		
		
		
		
	}

}
