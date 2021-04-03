package week2;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		System.out.println( -10 - 3); //-13
		System.out.println( +10 - 3); //7
		
		int a = 20;
		System.out.println(a++); // post: passes current value first ==> 20
		System.out.println(a);  // post: after passing current value then changes the value by 1
		
		int b = 100;
		System.out.println(b--); // 100
		System.out.println(b); // 99
		
		
		int a2=5;
       
        a2 = --a2; 
       // a2 = 4;
        
        System.out.println(a2);
        
        System.out.println("---------------------------");
        
        int x=5;
        System.out.println("x " + x); // 5
        
        
        x=x++;   // x= 5
        //x = 5
        
        System.out.println("x " + x++);
        //							5 ,  x = 6
        
        
        System.out.println("x " + x);
		
		
	}

}
