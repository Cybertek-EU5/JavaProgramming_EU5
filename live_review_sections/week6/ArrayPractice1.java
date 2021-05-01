package week6;

import java.util.Arrays;

public class ArrayPractice1 {
	
	public static void main(String[] args) {
		
		String[] colors = {"Yellow", "Green", "Black", "White", "Blue"};
		//					 0           1       2         3        4
		
		System.out.println(colors[1]);
		
		System.out.println("--------------------------------------------");
		
		int[] numbers = new int[4]; // indexes: 0,1,2,3
		  numbers[0]= 10;
		  numbers[1]= 20;
		  numbers[2]= 30;
		  numbers[3]= 40;
		  //numbers[4]= 50;
		//[10,20,30,40]
		  
		  numbers = new int[6];
		  
		  System.out.println( Arrays.toString( numbers ) );//[0,0,0,0,0,0]
		
		
	}

}
