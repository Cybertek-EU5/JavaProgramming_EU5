package day40_accessmodifiers_final;

public class FinalArray {

	public static void main(String[] args) {
		
		final int[] TEAMS = {11,10};
		System.out.println(TEAMS[0]);
		
		TEAMS[0] = 15;
		System.out.println(TEAMS[0]);
		
		int[] nums = new int[] {20,20,40};
		nums = new int[] {30,30,50};
		
		final int[] finalNums = {23,66,77};
		finalNums[0] = 120;
		
		//finalNums = new int[] {1,2,3};
		
		
		
		
		

	}

}
