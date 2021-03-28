package day15_methods_Part3;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
		System.out.println(sum(2,3,6));  
		
		int x = sum(10, 20, 30, 40);
		System.out.println(x);
		
		

	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int a,int b,int c) {
		return a+b+c;
		
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}

}


/*
  
 
1- Number of parameters
	add(int,int)
	add(int,int,int)

2-Data Type of Parameters
	add(int,int)
	add(int,float)
	
3- Sequence of data type parameters
	add(int,float)
	add(float,int)
	
4- Invalid Case - not overloading
	int add(int,int)
	float add(int,int)
	
*/
	




























