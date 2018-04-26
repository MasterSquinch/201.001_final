package edu.unca.csci201.Questions;

import edu.unca.csci201.Question;

public class TrueFalseQuestion implements Question{
	boolean isAdded = false;
boolean isTrue;
String text = "";

	public TrueFalseQuestion(String text) {
		this.text = text;
		
		if (text.charAt(0) == '#') {
			this.text = this.text.substring(1);
			this.isTrue = true;
		} else {
			this.isTrue = false;
		}
		
	}

	@Override
	public String getTheQuestionText() {
		return this.text;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		if (answer.equalsIgnoreCase("true") || answer.equalsIgnoreCase("false")) {
		    boolean a = Boolean.valueOf(answer);
		    if (this.isTrue == a) {
		    	return true;
		    } else {
		    	return false;
		    }
		} else {
		    return false;
		}
	}

	@Override
	public String getCorrectAnswer() {
		if (this.isTrue == true)
			return "true";
		return "false";
		
	}
}
