package edu.unca.csci201;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// import edu.unca.csci201.Questions.*;

public class Quiz {
	ArrayList<Question> qList = new ArrayList<Question>();
	
	public void addQuestion(Question Q) {
		qList.add(Q);
	}
	
	public double giveQuiz() {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		double finalScore = 1000;
		double s1Weight = (QuizTime.getSectionLength("se1") * 1000 ) / qList.size() + 1;
		double s2Weight = (QuizTime.getSectionLength("se2") * 1000 ) / qList.size() + 1;
		double s3Weight = (QuizTime.getSectionLength("se3") * 1000 ) / qList.size() + 1;
		
		System.out.println("Welcome to the Quiz to End All Quizzes- where your answers nor your score may have no meaning (or not!)\n\n");
		
		for (int i = 0; i < qList.size(); i++) {
			System.out.println("\n" + qList.get(i).getTheQuestionText());
			if (qList.get(i).isCorrectAnswer(in.nextLine())){
				break;
			} else {
				if (i < QuizTime.getSectionLength("se1")){
					finalScore -= s1Weight;
				} else
				if (QuizTime.getSectionLength("se1") <= i && i < QuizTime.getSectionLength("se2")){
					finalScore -= s2Weight;
				} else
				if (QuizTime.getSectionLength("se3") <= i){
					finalScore -= s3Weight;
				}
				
			}
		}
				System.out.println("The correct answers are:\n");
			for (int i = 0; i < qList.size(); i++){
				System.out.println(i + ".) " + qList.get(i).getCorrectAnswer());
			}
				
			System.out.println("Your final score is " + finalScore + "/ " + rand.nextInt(1000)+1);
				
		in.close();
		return finalScore;
		
		}
}

