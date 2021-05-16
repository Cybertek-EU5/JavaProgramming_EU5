package day34_Constructors;

public class DiceTest {

	public static void main(String[] args) {
		
		
		final int SIX_SIDES=6;
		Dice sixDice = new Dice(SIX_SIDES);

		rollDice(sixDice);
	}
	
	public static void rollDice(Dice d) {
		//Rolling a 6 sided dice
		System.out.println("Rolling a " + d.getSides() + " sided dice ");
		
		//The dice's value : 5
		System.out.println("The dice's value : " +  d.getValue());
	}
	


}
