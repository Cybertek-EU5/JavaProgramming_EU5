package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll( Arrays.asList(1,1,1,2,2,2,3,3,4,4,5,5,1,1,1,2,2,3,2,1,1,1) );
		
		/*
		for(int i=0; i < list.size(); i++) {
			if(list.get(i) < 3) {
				list.remove(i);
			}
		}   // WE HAVE TO APPLY Iterable to remove objects from Collection during the iteration
		*/
		
	//	list.removeIf( each -> each < 3 );
		list.removeAll(  Arrays.asList(1, 4 ) ); 
		
		System.out.println(list);
		
		System.out.println("-------------------------------------");
		
		String[] countryNames = {"United States Of America", "Untited Kingdom", "Turkey", 
			"Japan", "Korea", "Russia"
		};		
		
		ArrayList<String> countries = new ArrayList<>( Arrays.asList(countryNames) );
		
		System.out.println(countries);
		
		countries.removeIf( p -> p.length() > 10 ); // if the length of the object is greater than 10, then reomve it from arraylist
		
		System.out.println(countries);
		
		System.out.println("-----------------------------------------");
		
		String[] jobTitles = { "SDET", "SDET", "QA", "QA", "QE", "BA", "PO", "SM", "PO", "Data Analyst", "DEV", "QA", "QA"};
		
		ArrayList<String> jobList = new ArrayList<>( Arrays.asList(jobTitles));
		//jobList.retainAll(  Arrays.asList("SDET", "QA") );
		
		jobList.removeIf( each ->  !(each.equals("SDET") || each.equals("QA")) );
		
		System.out.println(jobList);
		
		
		
		
		
	}

}
