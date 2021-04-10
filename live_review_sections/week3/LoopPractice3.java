package week3;

public class LoopPractice3 {
	
	public static void main(String[] args) {
		
		// char: 'a' 'b' 'c' ... 'z'
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n-----------------------------");
		// char: 'z', 'y' 'x' ..... 'a'
		for(char i = 'z'; i >= 'a'; i-- ) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n-----------------------------");
		
		for(char i = 'A'; i <= 'Z'; i++ ) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n-----------------------------");
		
		for(char i = 'Z'; i >= 'A'; i-- ) {
			System.out.print(i+" ");
		}
		
		
		
	}

}

/*

3. write a program that can print a~z
4. write a program that can print A~Z
5. write a program that can print z~a
6. write a program that can print Z~A

*/