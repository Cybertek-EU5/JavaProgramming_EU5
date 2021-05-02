package day27_arrays_part4;

public class Teams {

	public static void main(String[] args) {
		
		//String[][] teams = new String[2][4];
		
		/*
		teams[0][0] = "MIke";
		teams[0][1] = "Tonny";
		teams[0][2] = "Smith";
		teams[0][3] = "Evan";
		
		teams[1][0] = "David";
		teams[1][1] = "Emmy";
		teams[1][2] = "John";
		teams[1][3] = "Ryan";
		*/
	
		
		String[][] teams1 =
				{ 
						{"Mike","Tonny","Smith","Evan"} , //row0
						{"David","Emmy","John","Ryan"}    //row1
				};
		
		
		System.out.println("First player of first team");
		System.out.println(teams1[0][0]);
		
		System.out.println("number of rows: " + teams1.length);
		System.out.println("# People in first team: " + teams1[0].length);
		System.out.println("# People in second team: " + teams1[1].length);
				
		
		

	}

}
