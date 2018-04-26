package edu.unca.csci201.Questions;

import edu.unca.csci201.Question;

public class ShortAnswerQuestion implements Question{
	boolean isAdded = false;
	String keyphrase = "";
	String correctAnswer = "";
	String text = "";
	int threshold;

	
	public ShortAnserQuestion(String text, String keyphrase, int threshold) {
		this.text = text;
		this.keyphrase = keyphrase;
		this.threshshold = threshold;
	}
	
	@Override
	public String getTheQuestionText() {
		return text;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
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

}
