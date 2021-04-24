package week5;

public class FrequencyOfWord {
	
	public static void main(String[] args) {
	
		/*
		String sentence = "javajavajavajava";
		//				 "javajavajava"
		//				 "javajava"
		//				 "java"
		//				  ""
		*/
		
		String sentence = "I like programming languages, Java is a programming language";
		//               "I like languages, Java is a programming language"
		//				 "I like languages, Java is a language"
		
		String word = "programming";
		
		int count = 0;
		while(sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		System.out.println(count);
		
		System.out.println("----------------------------------------------");
		
		String str = "cat cat cat cat cat cat dog dog dog dog dog cat cat";
		int numberofCats = frequency(str, "cat");
		int numberOfDogs = frequency(str, "dog");
		
		System.out.println(numberofCats);
		System.out.println(numberOfDogs);
		
		
	}
	
	
	public static int frequency(String sentence, String word) {
		sentence = sentence.toLowerCase();
		word =word.toLowerCase();
		int count = 0;
		while(sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		return count;
	}
	
	
	
	

}
