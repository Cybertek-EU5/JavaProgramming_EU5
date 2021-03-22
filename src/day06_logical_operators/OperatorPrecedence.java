package day06_logical_operators;


public class OperatorPrecedence {

	public static void main(String[] args) {
		
		int applesCount = 20;
		int orangesCount = 30;
		int pearsCount = 30;
		
		boolean comp = applesCount<orangesCount||orangesCount>=pearsCount; 
		
		// 20<30 || 30>=30 = > T || ---- = T
		
		System.out.println(comp);
		
		System.out.println("*************************");
		
		String outsideWeather;
		int degree;
		outsideWeather="Shinny";
		degree=70;
		
		boolean comp2 = (!(outsideWeather=="Rainy" || degree==70)); //(!(F||T) = > !T = > false
		
		System.out.println(comp2);
		
		System.out.println("*************************");
		
		int b = 2;
		
		boolean res  = ++b == 2 || --b == 2 && --b == 2;
		
		
		//b in memory : 2 = > 3 = > 2 = > 1
		//res         : 3 == 2 ||  2 == 2 &&  1 == 2;   //F || T && F   //F||F  //F
		
		System.out.println(res);
		
		System.out.println("*************************");
		
		boolean x  = true, z = true;
		int y = 20;
		x=(y!=10)&&(z=false);
		
		System.out.println(x);   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
