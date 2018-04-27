package edu.unca.csci201.Questions;

import edu.unca.csci201.Question;

public class MultipleChoiceQuestion implements Question{
	private boolean isAdded = false;
	String text = "";
	String[] answers;
	String correctAnswer = "";
	
	public MultipleChoiceQuestion(String text, String ... strings ) {
		this.text = text;
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
		
			for(int i = 0; i < answers.length; i++) {
				text = text+"\n"+answers[i];
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

	public boolean isAdded() {
		return isAdded;
	}

	public boolean setAdded(boolean isAdded) {
		this.isAdded = isAdded;
		return isAdded;
	}

}
