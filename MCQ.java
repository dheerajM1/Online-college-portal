package com.sunyalbany.onlineexam.objectbeans;

public class MCQ {
	private static final long serialVersionUID = 1L;

	private String question;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private String answer;
	private String hint1;
	private String hint2;
	private String hint3;
	private String feedback;
	private int mcqID;
	private String message;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMcqID() {
		return mcqID;
	}
	public void setMcqID(int mcqID) {
		this.mcqID = mcqID;
	}


	public static MCQ getInstance() {
		return new MCQ();

	}
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
		
	}

	public String getChoiceA() {
		return choiceA;
	}

	public void setChoiceA(String choiceA) {
		this.choiceA = choiceA;
	}

	public String getChoiceB() {
		return choiceB;
	}

	public void setChoiceB(String choiceB) {
		this.choiceB = choiceB;
	}

	public String getChoiceC() {
		return choiceC;
	}

	public void setChoiceC(String choiceC) {
		this.choiceC = choiceC;
	}

	public String getChoiceD() {
		return choiceD;
	}

	public void setChoiceD(String choiceD) {
		this.choiceD = choiceD;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getHint1() {
		return hint1;
	}

	public void setHint1(String hint1) {
		this.hint1 = hint1;
	}

	public String getHint2() {
		return hint2;
	}

	public void setHint2(String hint2) {
		this.hint2 = hint2;
	}

	public String getHint3() {
		return hint3;
	}

	public void setHint3(String hint3) {
		this.hint3 = hint3;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
