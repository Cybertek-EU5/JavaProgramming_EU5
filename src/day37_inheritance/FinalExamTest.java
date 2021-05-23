package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		//ask user how many question in the exam
		//ask user how many question is missed
		//give user the final grade
		
		Scanner sc = new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.println("How many questions are on the final exam?");
		questions = sc.nextInt();
		
		System.out.println("How many questionns did student miss?");
		missed = sc.nextInt();
		
		FinalExam exam = new FinalExam(questions,missed);
		
		System.out.println(exam.getGrade());
		
		
		
		
		
		

	}

}
