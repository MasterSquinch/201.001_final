package edu.unca.csci201.Questions;

import edu.unca.csci201.Question;

public class MultipleChoiceQuestion implements Question{

	String[] answers;
	String correctAnswer = "";
	
	public void giveAnswers(String ... strings ) {
		int a = strings.length;
		for (int i = 0; i < a; i++) {
			answers[i] = strings[i];
		}
		
		setCorrectAnswer();
	}
	
	public void setCorrectAnswer() {
		for (int i = answers.length - 1; i >= 0; i--) {
			if (answers[i].charAt(0) == '#') {
				answers[i] = answers[i].substring(1);
				correctAnswer = answers[i];
			}
		}
	}
	
	
	@Override
	public String getTheQuestionText() {
		String text = "";
		
			for(int i = 0; i < answers.length; i++) {
				text = "\n"+answers[i];
			}
		
		return text;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if (answer == correctAnswer) {
			return true;
		}
		return false;
	}

	@Override
	public String getCorrectAnswer() {
		return correctAnswer;
	}

}
