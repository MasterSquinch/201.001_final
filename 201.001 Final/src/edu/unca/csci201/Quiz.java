package edu.unca.csci201;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// import edu.unca.csci201.Questions.*;

public class Quiz {
	public ArrayList<Question> qList = new ArrayList<Question>();
	
	public void addQuestion(Question Q) {
		qList.add(Q);
	}
	
	public double giveQuiz() {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		double finalScore = 0;
		double s1Weight = (double) 45 / (double) QuizTime.getSectionLength("se1");
		double s2Weight = (double) 10 / (double) QuizTime.getSectionLength("se2");
		double s3Weight = (double) 45 / (double) QuizTime.getSectionLength("se3");
		
		System.out.println(QuizTime.getSectionLength("se1")+"\n"+s1Weight+"\n"+QuizTime.getSectionLength("se2")+"\n"+s2Weight+"\n"+QuizTime.getSectionLength("se3")+"\n"+s3Weight+"\n"+qList.size()+"\n");
		
		System.out.println("Welcome to the Quiz to End All Quizzes- where your answers nor your score may have no meaning (or not!)\n\n");
		
		for (int i = 0; i < qList.size(); i++) {
			System.out.println("\n" + i + " .) " + qList.get(i).getTheQuestionText());
			if (qList.get(i).isCorrectAnswer(in.nextLine())){
				if (i < QuizTime.getSectionLength("se1")){
					finalScore = finalScore + s1Weight;
				} else
				if (QuizTime.getSectionLength("se1") <= i && i < QuizTime.getSectionLength("se1") + QuizTime.getSectionLength("se2")){
					finalScore = finalScore + s2Weight;
				} else
				if (QuizTime.getSectionLength("se1") + QuizTime.getSectionLength("se2") <= i && i <= QuizTime.getSectionLength("se1") + QuizTime.getSectionLength("se2") + QuizTime.getSectionLength("se3")  ){
					finalScore = finalScore + s3Weight;
				}
			} else {
			}
		}
				System.out.println("The correct answers for the answers which you have answered incorrectly as well as the correct answers you have correctly provided are:\n");
			for (int i = 0; i < qList.size(); i++){
				System.out.println(i + ".) " + qList.get(i).getCorrectAnswer());
			}
				
			System.out.println("Your final score is " + finalScore + "/ " + rand.nextInt(1000)+1);
				
		in.close();
		return finalScore;
		
		}
}

