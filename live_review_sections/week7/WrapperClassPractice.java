package week7;

public class WrapperClassPractice {
	
	public static void main(String[] args) {
		
		String str = "a1b2c3d4e5f6";
		int sum = 0;
		
		for( char each : str.toCharArray() ) {
			if(Character.isDigit(each)) {
				sum += Integer.parseInt(""+each);
			}
		}
		
		System.out.println(sum);
		
		System.out.println("-----------------------------------------");
		
		String word = "abc@!de$f%ghi1kl2m3n4b5v6";
		String digits ="";
		String letters = "";
		String specialChars = "";
		
		for(char each  : word.toCharArray()) {
			if(Character.isDigit(each)) {
				digits += each;
			}else if(Character.isLetter(each)) {
				letters += each;
			}else{ // special chars
				specialChars += each;
			}
		}
		
		System.out.println(specialChars);
		System.out.println(digits);
		System.out.println(letters);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		
	}

}
