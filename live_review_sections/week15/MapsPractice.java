package week15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsPractice {
	
	public static void main(String[] args) {
		
		Map<String, Integer>  hashMap = new HashMap<>();
		hashMap.put(null, null);
		
		System.out.println(hashMap);
		
		
		Map<String, Integer>  linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(null, null);
		
		System.out.println(linkedHashMap);
		
		
		Map<String, Integer>  hashTable = new Hashtable<>();
		//hashTable.put(null, null);
		
		System.out.println(hashTable);
		
		
		Map<String, Integer>  treeMap = new TreeMap<>();
	//	treeMap.put(null, null);
		
		System.out.println(treeMap);
		
		
		
		
	}
}
