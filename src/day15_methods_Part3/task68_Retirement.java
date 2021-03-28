package day15_methods_Part3;

public class task68_Retirement {

	public static void main(String[] args) {
		
		yearsUntilRetirement("Mike",1950);

	}
	
	
	public static void yearsUntilRetirement(String name,int year) {  //name=MiKE  year=1950
		
		 //retirement age = 65 - age
		
		int retiremenAge = 65 - calculateAge(year);
		
		System.out.println(name  + " retires in " + retiremenAge + " years");
		
		
		
	}
	
	
	public static int calculateAge(int yearBirth) {
		
		return 2019-yearBirth;
		
	}
	
	


}
