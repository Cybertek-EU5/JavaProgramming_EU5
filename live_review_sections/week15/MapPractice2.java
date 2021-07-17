package week15;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

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
	        for( Integer eachValue  : scores.values()) {
	        	System.out.println(eachValue);
	        }
	        
	        System.out.println("-----------------------------------------");
	        // iterate the map by Entry
	        
	        for( Map.Entry<String, Integer>  each : scores.entrySet()) {
	        	//System.out.println(each);
	        	
	        	System.out.println(each.getKey() +" : " + each.getValue());
	        	
	        	
	        }
	        
	        System.out.println("---------------------------------------");
	        // forEach() method
	        
	        scores.forEach( (k, v) -> { System.out.println(k+" : "+v); }  );
	        
	        System.out.println("---------------------------------------");
	        
	        int max =  Collections.max(   scores.values() );
	       // String name = "";
	        
	        scores.forEach(  (k,v) ->  {  if(max == v) { System.out.println(k); }       } );
	        
	        System.out.println(max);
		
		
	}

}
