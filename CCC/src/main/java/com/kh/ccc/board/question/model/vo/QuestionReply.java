<<<<<<< HEAD
package com.kh.ccc.board.question.model.vo;

import java.sql.Date;



public class QuestionReply {
//	QR_NO	NUMBER
//	Q_NO	NUMBER
//	QR_WRITER	NUMBER
//	QR_CONTENT	VARCHAR2(500 BYTE)
//	QR_PARENT_NO	NUMBER
//	QR_LEVEL	NUMBER
//	QR_CREATE_DATE	DATE
//	QR_UPDATE_DATE	DATE
//	QR_DELETE_DATE	DATE
//	QR_STATUS	VARCHAR2(1 BYTE)
	
	private int questionReplyNo;
	private int questionNo;
	private int questionReplyWriterNo;
	private String questionReplyWriter;
	private String questionReplyContent;
	private int questionReplyParentNo;
	private int questionReplyLevel;
	private Date questionReplyCreateDate;
	private Date questionReplyUpdateDate;
	private Date questionReplyDeleteDate;
	private String questionReplyStatus;
	public QuestionReply() {
		super();
	}
	public QuestionReply(int questionReplyNo, int questionNo, int questionReplyWriterNo, String questionReplyWriter,
			String questionReplyContent, int questionReplyParentNo, int questionReplyLevel,
			Date questionReplyCreateDate, Date questionReplyUpdateDate, Date questionReplyDeleteDate,
			String questionReplyStatus) {
		super();
		this.questionReplyNo = questionReplyNo;
		this.questionNo = questionNo;
		this.questionReplyWriterNo = questionReplyWriterNo;
		this.questionReplyWriter = questionReplyWriter;
		this.questionReplyContent = questionReplyContent;
		this.questionReplyParentNo = questionReplyParentNo;
		this.questionReplyLevel = questionReplyLevel;
		this.questionReplyCreateDate = questionReplyCreateDate;
		this.questionReplyUpdateDate = questionReplyUpdateDate;
		this.questionReplyDeleteDate = questionReplyDeleteDate;
		this.questionReplyStatus = questionReplyStatus;
	}
	public int getQuestionReplyNo() {
		return questionReplyNo;
	}
	public void setQuestionReplyNo(int questionReplyNo) {
		this.questionReplyNo = questionReplyNo;
	}
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public int getQuestionReplyWriterNo() {
		return questionReplyWriterNo;
	}
	public void setQuestionReplyWriterNo(int questionReplyWriterNo) {
		this.questionReplyWriterNo = questionReplyWriterNo;
	}
	public String getQuestionReplyWriter() {
		return questionReplyWriter;
	}
	public void setQuestionReplyWriter(String questionReplyWriter) {
		this.questionReplyWriter = questionReplyWriter;
	}
	public String getQuestionReplyContent() {
		return questionReplyContent;
	}
	public void setQuestionReplyContent(String questionReplyContent) {
		this.questionReplyContent = questionReplyContent;
	}
	public int getQuestionReplyParentNo() {
		return questionReplyParentNo;
	}
	public void setQuestionReplyParentNo(int questionReplyParentNo) {
		this.questionReplyParentNo = questionReplyParentNo;
	}
	public int getQuestionReplyLevel() {
		return questionReplyLevel;
	}
	public void setQuestionReplyLevel(int questionReplyLevel) {
		this.questionReplyLevel = questionReplyLevel;
	}
	public Date getQuestionReplyCreateDate() {
		return questionReplyCreateDate;
	}
	public void setQuestionReplyCreateDate(Date questionReplyCreateDate) {
		this.questionReplyCreateDate = questionReplyCreateDate;
	}
	public Date getQuestionReplyUpdateDate() {
		return questionReplyUpdateDate;
	}
	public void setQuestionReplyUpdateDate(Date questionReplyUpdateDate) {
		this.questionReplyUpdateDate = questionReplyUpdateDate;
	}
	public Date getQuestionReplyDeleteDate() {
		return questionReplyDeleteDate;
	}
	public void setQuestionReplyDeleteDate(Date questionReplyDeleteDate) {
		this.questionReplyDeleteDate = questionReplyDeleteDate;
	}
	public String getQuestionReplyStatus() {
		return questionReplyStatus;
	}
	public void setQuestionReplyStatus(String questionReplyStatus) {
		this.questionReplyStatus = questionReplyStatus;
	}
	@Override
	public String toString() {
		return "QuestionReply [questionReplyNo=" + questionReplyNo + ", questionNo=" + questionNo
				+ ", questionReplyWriterNo=" + questionReplyWriterNo + ", questionReplyWriter=" + questionReplyWriter
				+ ", questionReplyContent=" + questionReplyContent + ", questionReplyParentNo=" + questionReplyParentNo
				+ ", questionReplyLevel=" + questionReplyLevel + ", questionReplyCreateDate=" + questionReplyCreateDate
				+ ", questionReplyUpdateDate=" + questionReplyUpdateDate + ", questionReplyDeleteDate="
				+ questionReplyDeleteDate + ", questionReplyStatus=" + questionReplyStatus + "]";
	}
	
	
	
}
=======
package com.kh.ccc.board.question.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuestionReply {
//	QR_NO	NUMBER
//	Q_NO	NUMBER
//	QR_WRITER	NUMBER
//	QR_CONTENT	VARCHAR2(500 BYTE)
//	QR_PARENT_NO	NUMBER
//	QR_LEVEL	NUMBER
//	QR_CREATE_DATE	DATE
//	QR_UPDATE_DATE	DATE
//	QR_DELETE_DATE	DATE
//	QR_STATUS	VARCHAR2(1 BYTE)
	
	private int questionReplyNo;
	private int questionNo;
	private int questionReplyWriterNo;
	private String questionReplyWriter;
	private String questionReplyContent;
	private int questionReplyParentNo;
	private int questionReplyLevel;
	private Date questionReplyCreateDate;
	private Date questionReplyUpdateDate;
	private Date questionReplyDeleteDate;
	private String questionReplyStatus;
}
>>>>>>> refs/remotes/origin/ABC
