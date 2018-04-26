package edu.unca.csci201;

import java.util.Random;

import edu.unca.csci201.Questions.*;

public class QuizTime {
	Random rand = new Random();
	Question[] mcQuestions = {
			
	};
	Question[] tfQuestions = {
			
	};
	Question[] saQuestions = {
			
	};
	
	Question[] se1;
	Question[] se2;
	Question[] se3;
	
	int s1 = 0;
	int s2 = 0;
	int s3 = 0;
	
	public void generateSections() {
		for(s1; s1 <= 15; s1++){
			int b = rand.nextInt(25);
			if (mcQuestions[b].isAdded = false){
				if (rand.nextInt(4) > 0{
					se1[s1] = mcQuestions[b];	
				}else{
					return;
				}
			} else {
			 return;
			}
		}
		
		for(s2 = 16 - (15-se1.length); s2 <= 20; s2++){
			int b = rand.nextInt(25);
			if (tfQuestions[b].isAdded = false){
				if (rand.nextInt(4) > 0{
					se2[s2] = tfQuestions[b];	
				}else{
					return;
				}
			} else {
			 return;
			}
		}
				    
		for(s3 = 21 - (20-se2.length); s3 <= 24; s3++){
			int b = rand.nextInt(25);
			if (saQuestions[b].isAdded = false){
				if (rand.nextInt(2) > 0{
					se3[s3] = saQuestions[b];	
				}else{
					return;
				}
			} else {
			 return;
			}
		}
			
	}
				    

public static int getSectionLength(Question[] s){
	return s.length;
}
	
 public static void main(String[] args) {
	 Quiz quiz = new Quiz();
	 for (int i = 0; i < se1.length; i++){
		 quiz.addQuestion(se1[i]);
	 }
	 for (int i = se1.length; i < (se1.length + se2.length); i++ ){
		 quiz.addQuestion(se2[i]);
	 }
	 for (int i = (se1.length + se2.length); i < ((se1.length + se2.length) + se3.length); i++ ){
		 quiz.addQuestion(se3[i]);
	 }
	 
	 
	 quiz.giveQuiz();
 }
}
