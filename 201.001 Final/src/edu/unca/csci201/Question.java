package edu.unca.csci201;

import edu.unca.csci201.Questions.*;

public interface Question {

	public String getTheQuestionText();
	
	public boolean isCorrectAnswer(String answer);
	
	public String getCorrectAnswer();
	
}
