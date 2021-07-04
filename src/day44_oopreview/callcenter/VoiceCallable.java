package day44_oopreview.callcenter;

public interface VoiceCallable {
	
	boolean CAN_CALL = true; //public static final boolean CAN_CALL=true;
	
	//abstract method
	void call(String contact); //public abstract void call(String contact)
	
	//static method 
	public static void decline(){
		System.out.println("Mike declined voice call..");
	}
	
	//default method
	public default void accept() {
		System.out.println("Mike finally accepted voice call..");
	}

}
