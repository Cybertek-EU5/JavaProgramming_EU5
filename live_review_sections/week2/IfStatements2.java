package week2;

public class IfStatements2 {
	
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 0 && score <= 100) { // if score is valid
			
			if(score >= 90) {  // fails : score < 90
				System.out.println("Excellent");
			}else if(score >= 70 ) { // fails: score < 70
				System.out.println("Good");
			}else if(score >= 60  ) { // fails: score < 60
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
			
			
		}else { // if score is not valid
			System.out.println("Invalid Score");
			
		}
		
		
		
		
		
		
		
		
		
	}
	

}

/*
   write a program that can calculate the grade. 

        1. if grade is equal or bigger then 90 output "Excellent" 
        2. if the grade is equal or bigger then 70 and smaller then 90 output "Good"
        3. if grade is equal or bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"

        ex: score = 75
            output:
                Good

        HINT: you will need && logic
*/