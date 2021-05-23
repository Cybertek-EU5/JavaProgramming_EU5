package day37_inheritance;

public class FinalExam extends GradeActivity {

	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	
	public FinalExam(int numQuestions,int numMissed) {
		
		double numericScore;
		
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0 / numQuestions;
		numericScore = 100.0 - (numMissed * pointsEach);
		
		
		//My goal is to receive the letter based on my numericScore
		//how will I set my numericScore to score
		
		
		setScore(numericScore);
		
	}

}
