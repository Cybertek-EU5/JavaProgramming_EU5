package day23_stringManipulationLab_randomClasss;

public class Question_17_Palindrome {

	public static void main(String[] args) {
		
	//String str = "madam";    //< -
	
	String str = "Taco cat";  //tac ocaT   
	
		String dummy="";
		
		//forwardString.equals(backwarString) =true    
		
		//  m + a + d + a + m
		//  4   3   2   1   0
		
		//  m + o + m
		//  2   1   0
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			dummy = dummy + str.charAt(i);    // "" + m
			                                  // m + a = ma
			                                  // ma + d = mad
		}
		
		if(str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
