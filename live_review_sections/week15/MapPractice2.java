package week15;

import java.util.TreeMap;

public class MapPractice2 {
	
	public static void main(String[] args) {
		 TreeMap<String, Integer> scores = new TreeMap<>();
	        scores.put("Mohammad", 99);
	        scores.put("Hoshang", 98);
	        scores.put("Jawad", 82);
	        scores.put("Munir", 64);
	        scores.put("Akbar", 74);
	        scores.put("Spu", 95);
	        scores.put("Simona",83);
	        scores.put("Pedro",81);
	        
	        System.out.println(scores);
	        
	        System.out.println(scores.get("Mohammad"));
	        
	        scores.remove("Mohammad");
	        
	        System.out.println(scores);
	        
	        System.out.println("---------------------------------------------");
	        // iterate the map by keys:
	        for(String eachKey  : scores.keySet()) {
	        	Integer eachValue = scores.get(eachKey);
	        	
	        	System.out.println(  eachKey +" : "+eachValue  );
	        	
	        }
	        
	        System.out.println("------------------------------------");
	        // iterate map by values:
	        for(   : scores.values())
	        
	        
		
		
	}

}
