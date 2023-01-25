package com.kh.ccc.board.question.model.vo;



public class QuestionAttach {
//	QA_NO	NUMBER
//	Q_NO	NUMBER
//	QA_ORIGIN_NAME	VARCHAR2(500 BYTE)
//	QA_CHANGE_NAME	VARCHAR2(500 BYTE)
//	QA_FILE_PATH	VARCHAR2(500 BYTE)
//	QA_STATUS	VARCHAR2(1 BYTE)
	
	private int questionAttachNo;
	private int questionNo;
	private String questionAttachOriginName;
	private String questionAttachChangeName;
	private String questionAttachFilePath;
	private String questionAttachStatus;
	public QuestionAttach() {
		super();
	}
	public QuestionAttach(int questionAttachNo, int questionNo, String questionAttachOriginName,
			String questionAttachChangeName, String questionAttachFilePath, String questionAttachStatus) {
		super();
		this.questionAttachNo = questionAttachNo;
		this.questionNo = questionNo;
		this.questionAttachOriginName = questionAttachOriginName;
		this.questionAttachChangeName = questionAttachChangeName;
		this.questionAttachFilePath = questionAttachFilePath;
		this.questionAttachStatus = questionAttachStatus;
	}
	public int getQuestionAttachNo() {
		return questionAttachNo;
	}
	public void setQuestionAttachNo(int questionAttachNo) {
		this.questionAttachNo = questionAttachNo;
	}
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public String getQuestionAttachOriginName() {
		return questionAttachOriginName;
	}
	public void setQuestionAttachOriginName(String questionAttachOriginName) {
		this.questionAttachOriginName = questionAttachOriginName;
	}
	public String getQuestionAttachChangeName() {
		return questionAttachChangeName;
	}
	public void setQuestionAttachChangeName(String questionAttachChangeName) {
		this.questionAttachChangeName = questionAttachChangeName;
	}
	public String getQuestionAttachFilePath() {
		return questionAttachFilePath;
	}
	public void setQuestionAttachFilePath(String questionAttachFilePath) {
		this.questionAttachFilePath = questionAttachFilePath;
	}
	public String getQuestionAttachStatus() {
		return questionAttachStatus;
	}
	public void setQuestionAttachStatus(String questionAttachStatus) {
		this.questionAttachStatus = questionAttachStatus;
	}
	@Override
	public String toString() {
		return "QuestionAttach [questionAttachNo=" + questionAttachNo + ", questionNo=" + questionNo
				+ ", questionAttachOriginName=" + questionAttachOriginName + ", questionAttachChangeName="
				+ questionAttachChangeName + ", questionAttachFilePath=" + questionAttachFilePath
				+ ", questionAttachStatus=" + questionAttachStatus + "]";
	}
	
	
	
}
