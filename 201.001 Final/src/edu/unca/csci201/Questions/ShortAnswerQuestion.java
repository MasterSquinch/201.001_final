package edu.unca.csci201.Questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.unca.csci201.Question;

public class ShortAnswerQuestion implements Question{
	private boolean isAdded = false;
	private String keyphrase = "";
	private String correctAnswer = "This is a open ended question, graded on both a qualitive and quantitive basis.";
	private String text = "";
	private int threshold;
	private String answer = "";

	
	public ShortAnswerQuestion(String text, String keyphrase, int threshold) {
		this.text = text;
		this.keyphrase = keyphrase;
		this.threshold = threshold;
	}
	
	@Override
	public String getTheQuestionText() {
		return text;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
		this.answer = answer;
		int i = 0;
		Pattern p = Pattern.compile( this.keyphrase );
		Matcher m = p.matcher( answer );
		while (m.find()) {
   		 i++;
		}
		if ( this.threshold <= i )
			return true;
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
