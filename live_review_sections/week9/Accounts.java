package week9;

public class Accounts {
	
	public static void main(String[] args) {
		
		Credentials google = new Credentials();
		/*
		google.username = "123";
		google.password ="9876";
		System.out.println(google.username);
		System.out.println(google.password);
		*/
		
		google.setUsername("cybertekschool@gmail.com");
		System.out.println( google.getUsername() );
		
		google.setPassword("a876");
		System.out.println(google.getPassword());
		
	}

}
