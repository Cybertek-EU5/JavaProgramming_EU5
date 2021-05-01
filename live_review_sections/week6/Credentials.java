package week6;

import java.util.Scanner;

public class Credentials {

	public static void main(String[] args) {
		String EU = "Cybertek";
		String EP = "Cybertek123";

		System.out.println("----------------------------------------");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your username: ");
		String username = scan.next();

		System.out.println("Enter your password: ");
		String password = scan.next();

		if (username.equals(EU) && password.equals(EP)) { // user entered username & password are correct
			System.out.println("You logged in");

		} else { // user entered username & password are incorrect: 3 more tries

			for (int i = 1; i <= 3; i++) {

				if(i == 3) {
					System.err.println("your account is locked, please contact with costomer service");
					System.exit(0);
				}
				
				System.out.println("Username or password is incorrect!");
				System.out.println("Please re-enter your username");
				username = scan.next();

				System.out.println("Please re-enter your password");
				password = scan.next();
				
				if(username.equals(EU) && password.equals(EP)) {
					System.out.println("You logged in");
					break;
				}
				
				
				
			}
			

		}
		
		
		
		

	}

}

/*
 * String expectedUserName = "Cybertek"; String expectedPassWord =
 * "Cybertek123";
 * 
 * 1. Ask user to enter Cybertek username
 * 
 * 2. Ask user to enter Cybertek password
 * 
 * 3. if username & password both matches with the expected username and
 * passwords output: logged in 4. if username || password is not matched, ask
 * the user to re-enter USER WILL ONLY HAVE 3 chances, after 3rd attempt if the
 * username || password still invalid: account should be locked
 * 
 */