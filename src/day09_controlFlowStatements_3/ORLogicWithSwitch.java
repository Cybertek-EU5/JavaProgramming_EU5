package day09_controlFlowStatements_3;

public class ORLogicWithSwitch {

	public static void main(String[] args) {
		
		char grade = 'D';
		
		//A or B or C - >  pass D or E - > fail
		
//		switch(grade) {
//		case 'A':
//			System.out.println("pass");
//			break;
//		case 'B':
//			System.out.println("pass");
//			break;
//		case 'C':
//			System.out.println("pass");
//			break;
//		case 'D':
//			System.out.println("fail");
//			break;
//		case 'E':
//			System.out.println("fail");
//			break;
//		}
		
		switch(grade) {
		case 'A':case 'B':case 'C':
			System.out.println("pass");
			break;
		case 'D':case 'E':
			System.out.println("fail");
			break;
		}
		
		
	}

}
