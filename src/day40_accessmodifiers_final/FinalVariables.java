package day40_accessmodifiers_final;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;
	
	public FinalVariables() {
		MODEL_3_MAXSPEED = 200;
		//ADMIN_USERNAME = "Ozzy";
		
	}
	
	{
		MODEL_X_PASSENGERS = 7;
	}
	
	static {
		
		ADMIN_USERNAME = "Ozzy";
	}

	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT=5;
		
		final int SSN ;
		SSN=66;
		//SSN++;
		
		FinalVariables fv = new FinalVariables();
		System.out.println(fv.ROADSTER_MAX_RANGE);
		System.out.println(fv.MODEL_3_MAXSPEED);
		System.out.println(FinalVariables.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
