package day36_staticClassMembers;

public class AllBlocks {
	
	public AllBlocks(int x) {
		System.out.println("One Argument Constructor");
	}
	
	public AllBlocks() {
		System.out.println("No argument constructor");
	}
	
	static {
		System.out.println("Firsrt Static Init");
	}
	
	{
		System.out.println("First Instnce Init");
	}
	
	{
		System.out.println("Second Instance Init");
	}
	
	static{
		System.out.println("Second Static Init");
	}

}
