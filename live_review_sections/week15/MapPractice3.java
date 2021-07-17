package week15;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
	
	public static void main(String[] args) {
		
		 LinkedHashMap<String, Integer> employeeInfo = new LinkedHashMap<>();
	        employeeInfo.put("A",120000);
	        employeeInfo.put("B",130000);
	        employeeInfo.put("C",110000);
	        employeeInfo.put("D",140000);
	        employeeInfo.put("E",130000);
	        employeeInfo.put("F",150000);
	        
	        
	        String nameOfMaxSalary = "";
	        int max  = 0;
	        
	        String nameOfMinSalary = "";
	        int min = Integer.MAX_VALUE;
	        
	        
	        
	        for( Map.Entry<String, Integer>  each : employeeInfo.entrySet() ) {
	        	//System.out.println(each);
	        	String eachName = each.getKey();
	        	int eachSalary = each.getValue();
	        	
	        	if(eachSalary > max ) {
	        		max = eachSalary;
	        		nameOfMaxSalary = eachName;
	        	}
	        	
	        	if(eachSalary < min) {
	        		min = eachSalary;
	        		nameOfMinSalary = eachName;
	        	}
	        	
	        }
	        
	        
	        System.out.println(nameOfMaxSalary+" : "+max);
	        System.out.println(nameOfMinSalary+" : "+min);
	        
	        
		
		
		
	}

}
