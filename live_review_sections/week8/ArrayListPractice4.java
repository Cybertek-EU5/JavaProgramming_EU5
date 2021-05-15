package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice4 {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();	
		list.addAll(  Arrays.asList('D', 'B', 'C','A', 'A','A') );
		
		Collections.sort(list); // sorts in ascending order
		System.out.println(list);
		
		Collections.swap(list,  list.size()-1, 0 );
		
		System.out.println(list);
		
		Collections.replaceAll(list, 'A', 'E');
		System.out.println(list);
		
		int frequencyOfE = Collections.frequency(list, 'E');
		System.out.println(frequencyOfE);
		
		System.out.println("------------------------------------");
		
		ArrayList<Integer> numbers = new ArrayList<>(  );
		numbers.addAll(Arrays.asList(1,2,3,1,2,3,4,5,5,6,7,7));
		
		System.out.println(numbers);
		
		for(Integer each : numbers) {
			if( Collections.frequency(numbers, each) == 1 ) { // if frequency of the element in arraylist is 1, then it's unique
				System.out.println(each);
			}
		}
		
		System.out.println("------------------------------------");
		
		String str = "aabccd";
		String unique = "";
		
		ArrayList<String> chars = new ArrayList<>( Arrays.asList(str.split("")) );
		
		for(String each : chars) {
			int f = Collections.frequency(chars, each);
			if(f == 1) {
				unique += each;
			}
		
		}
		
		
		System.out.println(unique);
		
		System.out.println("--------------------------------------------");
		
		String s = "aabbbcccc";
		String result = "";	 // a2b3c4
		
		ArrayList<String> characters = new ArrayList<>( Arrays.asList( s.split("") ) );
		
		for(String each : characters) {
			int f = Collections.frequency(characters, each);
			if(!result.contains(each)) {
				result += each+f;
			}
		}
		
		System.out.println(result);
		
		
		
	}

}
