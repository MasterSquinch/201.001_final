package edu.unca.csci201.Questions;

import edu.unca.csci201.Question;

public class TrueFalseQuestion implements Question{
boolean isTrue;
	@Override
	public String getTheQuestionText() {
		// TODO Auto-generated method stub
		return null;
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
