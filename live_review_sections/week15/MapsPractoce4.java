package week15;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsPractoce4 {
	
	
	public static void main(String[] args) {
		String str = "aaabbccccdefghi";  
		
		Map<String, Integer> result = new LinkedHashMap<>(); // {a=3, b=2, c=4}
		Map<String, Integer> result2 = new LinkedHashMap<>();
		
		String[] arr = str.split("");  //{a,a,a,b,b,c,c,c,c}
		
		for(String each  : arr) {
			
			int frequency = Collections.frequency( Arrays.asList( arr ) , each);
			
			result.put(each, frequency);
			
			if(frequency == 1) {
				result2.put(each, frequency);
			}
			
		}
		
		System.out.println(result);
		System.out.println(result2);
		
		
		
		
		
	}
	

}
