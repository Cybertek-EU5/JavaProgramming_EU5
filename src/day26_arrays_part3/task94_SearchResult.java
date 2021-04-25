package day26_arrays_part3;

import java.util.Arrays;

public class task94_SearchResult {

	public static void main(String[] args) {
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

		
		String[] infoArray1 = info1.split("password :");
		String[] infoArray2 = info2.split("password :");
		
		System.out.println(Arrays.toString(infoArray1));
		
		
		String pass1 = infoArray1[1].split(". Please")[0];
		
		System.out.println(Arrays.toString(infoArray1[1].split(". Please")));
		
		
		String pass2 = infoArray2[1].split(". Please")[0];
		
		pass1 = pass1.substring(4, 10);
		pass2 = pass2.substring(4, 10);
		
		
		System.out.println(pass1.trim() + pass2.trim());
		
	
		
	
		
		
		
		
		
	
		
		
		
	}

}
