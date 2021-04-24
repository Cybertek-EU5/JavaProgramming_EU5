package week5;

public class FrequencyOfCharacters {
	
	public static void main(String[] args) {
		
		String str = "aaabbcccc";
		String result = ""; //a3b2c4;
		
		for(int j = 0; j < str.length(); j++) {
			
			char ch = str.charAt(j);  // each char of str,
			int count = 0; // for the frequency of ch
			
			for(int i = 0; i< str.length(); i++) { //i: index numbers of str
				if(ch == str.charAt(i)) { // ch will be compared with each characters of str
					count++ ;
				}
			}
			
			if(!result.contains(""+ch)) {  // characters should not duplicated in the result
				result += ch+""+count;
			}
			
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
