<<<<<<< HEAD
package com.kh.ccc.board.question.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Question {
//	Q_NO	NUMBER
//	Q_LEVEL	NUMBER
//	Q_WRITER	NUMBER
//	Q_TYPE	NUMBER
//	Q_TITLE	VARCHAR2(100 BYTE)
//	Q_CONTENT	VARCHAR2(3000 BYTE)
//	Q_RESPONSE	VARCHAR2(3000 BYTE)
//	Q_COUNT	NUMBER
//	Q_CREATE_DATE	DATE
//	Q_UPDATE_DATE	DATE
//	Q_DELETE_DATE	DATE
//	Q_STATUS	VARCHAR2(1 BYTE)
	
	private int questionNo;
	private int questionLevel;
	private int questionWriterNo; 
	private String questionWriter;
	private int questionTypeNo;
	private String questionType;
	private String questionTitle;
	private String questionContent;
	private String questionResponse;
	private int questionCount;
	private Date questionCreateDate;
	private Date questionUpdateDate;
	private Date questionDeleteDate;
	private String questionStatus;
	public Question() {
		super();
	}
	public Question(int questionNo, int questionLevel, int questionWriterNo, String questionWriter, int questionTypeNo,
			String questionType, String questionTitle, String questionContent, String questionResponse,
			int questionCount, Date questionCreateDate, Date questionUpdateDate, Date questionDeleteDate,
			String questionStatus) {
		super();
		this.questionNo = questionNo;
		this.questionLevel = questionLevel;
		this.questionWriterNo = questionWriterNo;
		this.questionWriter = questionWriter;
		this.questionTypeNo = questionTypeNo;
		this.questionType = questionType;
		this.questionTitle = questionTitle;
		this.questionContent = questionContent;
		this.questionResponse = questionResponse;
		this.questionCount = questionCount;
		this.questionCreateDate = questionCreateDate;
		this.questionUpdateDate = questionUpdateDate;
		this.questionDeleteDate = questionDeleteDate;
		this.questionStatus = questionStatus;
	}
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public int getQuestionLevel() {
		return questionLevel;
	}
	public void setQuestionLevel(int questionLevel) {
		this.questionLevel = questionLevel;
	}
	public int getQuestionWriterNo() {
		return questionWriterNo;
	}
	public void setQuestionWriterNo(int questionWriterNo) {
		this.questionWriterNo = questionWriterNo;
	}
	public String getQuestionWriter() {
		return questionWriter;
	}
	public void setQuestionWriter(String questionWriter) {
		this.questionWriter = questionWriter;
	}
	public int getQuestionTypeNo() {
		return questionTypeNo;
	}
	public void setQuestionTypeNo(int questionTypeNo) {
		this.questionTypeNo = questionTypeNo;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getQuestionResponse() {
		return questionResponse;
	}
	public void setQuestionResponse(String questionResponse) {
		this.questionResponse = questionResponse;
	}
	public int getQuestionCount() {
		return questionCount;
	}
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	public Date getQuestionCreateDate() {
		return questionCreateDate;
	}
	public void setQuestionCreateDate(Date questionCreateDate) {
		this.questionCreateDate = questionCreateDate;
	}
	public Date getQuestionUpdateDate() {
		return questionUpdateDate;
	}
	public void setQuestionUpdateDate(Date questionUpdateDate) {
		this.questionUpdateDate = questionUpdateDate;
	}
	public Date getQuestionDeleteDate() {
		return questionDeleteDate;
	}
	public void setQuestionDeleteDate(Date questionDeleteDate) {
		this.questionDeleteDate = questionDeleteDate;
	}
	public String getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(String questionStatus) {
		this.questionStatus = questionStatus;
	}
	@Override
	public String toString() {
		return "Question [questionNo=" + questionNo + ", questionLevel=" + questionLevel + ", questionWriterNo="
				+ questionWriterNo + ", questionWriter=" + questionWriter + ", questionTypeNo=" + questionTypeNo
				+ ", questionType=" + questionType + ", questionTitle=" + questionTitle + ", questionContent="
				+ questionContent + ", questionResponse=" + questionResponse + ", questionCount=" + questionCount
				+ ", questionCreateDate=" + questionCreateDate + ", questionUpdateDate=" + questionUpdateDate
				+ ", questionDeleteDate=" + questionDeleteDate + ", questionStatus=" + questionStatus + "]";
	}
	
	
	
	
}
=======
package com.kh.ccc.board.question.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Question {
//	Q_NO	NUMBER
//	Q_LEVEL	NUMBER
//	Q_WRITER	NUMBER
//	Q_TYPE	NUMBER
//	Q_TITLE	VARCHAR2(100 BYTE)
//	Q_CONTENT	VARCHAR2(3000 BYTE)
//	Q_RESPONSE	VARCHAR2(3000 BYTE)
//	Q_COUNT	NUMBER
//	Q_CREATE_DATE	DATE
//	Q_UPDATE_DATE	DATE
//	Q_DELETE_DATE	DATE
//	Q_STATUS	VARCHAR2(1 BYTE)
	
	private int questionNo;
	private int questionLevel;
	private int questionWriterNo; 
	private String questionWriter;
	private int questionTypeNo;
	private String questionType;
	private String questionTitle;
	private String questionContent;
	private String questionResponse;
	private int questionCount;
	private Date questionCreateDate;
	private Date questionUpdateDate;
	private Date questionDeleteDate;
	private String questionStatus;
}
>>>>>>> refs/remotes/origin/ABC
