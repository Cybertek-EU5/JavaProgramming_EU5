package day23_stringManipulationLab_randomClasss;

import java.util.Random;

public class task85_DiceGame {

	public static void main(String[] args) {
		
		Random rn = new Random();
		int computerDice;
		int userDice;
		int computerPoints=0;
		int userPoints=0;
		
		for(int i=0;i<10;i++) {
			
			computerDice = rn.nextInt(6)+1;
			userDice = rn.nextInt(6)+1;
			
			if(computerDice>userDice) {
				computerPoints++;
			}else if(userDice>computerDice) {
				userPoints++;
			}
		}
		
		System.out.println("Computer point is:" + computerPoints);
		System.out.println("User point is:" + userPoints);
		
		if(computerPoints>userPoints) {
			System.out.println("Computer wins");
		}else if(userPoints>computerPoints) {
			System.out.println("User wins");
		}else {
			System.out.println("There is no winner");
		}

	}

}
