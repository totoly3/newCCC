package com.kh.ccc.board.charBoard.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CharReply {
	
	private int 	reNo;			//댓글 번호
	private int 	refBno;			//참조게시글 번호
	private String 	reContent; 		//댓글 내용
	private int 	reWriterNo;		//작성자 회원번호
	private String	reWriterName;	//작성자 아이디
	private int		reGroupNo;		//참조댓글번호
	private int		reParentNo;		//부모댓글번호
	private int		reStep;			//대댓글의 순서
	private int		reLevel;		//댓글계층
	private Date 	reCreateDate;	//작성일
	private String 	reStatus;		//상태값(Y/N)
	public CharReply() {
		super();
	}
	public CharReply(int reNo, int refBno, String reContent, int reWriterNo, String reWriterName, int reGroupNo,
			int reParentNo, int reStep, int reLevel, Date reCreateDate, String reStatus) {
		super();
		this.reNo = reNo;
		this.refBno = refBno;
		this.reContent = reContent;
		this.reWriterNo = reWriterNo;
		this.reWriterName = reWriterName;
		this.reGroupNo = reGroupNo;
		this.reParentNo = reParentNo;
		this.reStep = reStep;
		this.reLevel = reLevel;
		this.reCreateDate = reCreateDate;
		this.reStatus = reStatus;
	}
	public int getReNo() {
		return reNo;
	}
	public void setReNo(int reNo) {
		this.reNo = reNo;
	}
	public int getRefBno() {
		return refBno;
	}
	public void setRefBno(int refBno) {
		this.refBno = refBno;
	}
	public String getReContent() {
		return reContent;
	}
	public void setReContent(String reContent) {
		this.reContent = reContent;
	}
	public int getReWriterNo() {
		return reWriterNo;
	}
	public void setReWriterNo(int reWriterNo) {
		this.reWriterNo = reWriterNo;
	}
	public String getReWriterName() {
		return reWriterName;
	}
	public void setReWriterName(String reWriterName) {
		this.reWriterName = reWriterName;
	}
	public int getReGroupNo() {
		return reGroupNo;
	}
	public void setReGroupNo(int reGroupNo) {
		this.reGroupNo = reGroupNo;
	}
	public int getReParentNo() {
		return reParentNo;
	}
	public void setReParentNo(int reParentNo) {
		this.reParentNo = reParentNo;
	}
	public int getReStep() {
		return reStep;
	}
	public void setReStep(int reStep) {
		this.reStep = reStep;
	}
	public int getReLevel() {
		return reLevel;
	}
	public void setReLevel(int reLevel) {
		this.reLevel = reLevel;
	}
	public Date getReCreateDate() {
		return reCreateDate;
	}
	public void setReCreateDate(Date reCreateDate) {
		this.reCreateDate = reCreateDate;
	}
	public String getReStatus() {
		return reStatus;
	}
	public void setReStatus(String reStatus) {
		this.reStatus = reStatus;
	}
	@Override
	public String toString() {
		return "CharReply [reNo=" + reNo + ", refBno=" + refBno + ", reContent=" + reContent + ", reWriterNo="
				+ reWriterNo + ", reWriterName=" + reWriterName + ", reGroupNo=" + reGroupNo + ", reParentNo="
				+ reParentNo + ", reStep=" + reStep + ", reLevel=" + reLevel + ", reCreateDate=" + reCreateDate
				+ ", reStatus=" + reStatus + "]";
	}
	
	
	
	
}
