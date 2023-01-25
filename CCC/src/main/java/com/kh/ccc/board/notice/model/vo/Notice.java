package com.kh.ccc.board.notice.model.vo;

import java.sql.Date;


public class Notice {
//	N_NO	NUMBER
//	N_WRITER	NUMBER
//	N_TYPE	NUMBER
//	N_TITLE	VARCHAR2(100 BYTE)
//	N_CONTENT	VARCHAR2(3000 BYTE)
//	N_COUNT	NUMBER
//	N_CREATE_DATE	DATE
//	N_UPDATE_DATE	DATE
//	N_DELETE_DATE	DATE
//	N_STATUS	VARCHAR2(1 BYTE)
	
	private int noticeNo;
	private int noticeWriterNo; 
	private String noticeWriter;
	private int noticeTypeNo;
	private String noticeType;
	private String noticeTitle;
	private String noticeContent;
	private int noticeCount;
	private Date noticeCreateDate;
	private Date noticeUpdateDate;
	private Date noticeDeleteDate;
	private String noticeStatus;
	public Notice() {
		super();
	}
	public Notice(int noticeNo, int noticeWriterNo, String noticeWriter, int noticeTypeNo, String noticeType,
			String noticeTitle, String noticeContent, int noticeCount, Date noticeCreateDate, Date noticeUpdateDate,
			Date noticeDeleteDate, String noticeStatus) {
		super();
		this.noticeNo = noticeNo;
		this.noticeWriterNo = noticeWriterNo;
		this.noticeWriter = noticeWriter;
		this.noticeTypeNo = noticeTypeNo;
		this.noticeType = noticeType;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeCount = noticeCount;
		this.noticeCreateDate = noticeCreateDate;
		this.noticeUpdateDate = noticeUpdateDate;
		this.noticeDeleteDate = noticeDeleteDate;
		this.noticeStatus = noticeStatus;
	}
	public int getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}
	public int getNoticeWriterNo() {
		return noticeWriterNo;
	}
	public void setNoticeWriterNo(int noticeWriterNo) {
		this.noticeWriterNo = noticeWriterNo;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	public int getNoticeTypeNo() {
		return noticeTypeNo;
	}
	public void setNoticeTypeNo(int noticeTypeNo) {
		this.noticeTypeNo = noticeTypeNo;
	}
	public String getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public int getNoticeCount() {
		return noticeCount;
	}
	public void setNoticeCount(int noticeCount) {
		this.noticeCount = noticeCount;
	}
	public Date getNoticeCreateDate() {
		return noticeCreateDate;
	}
	public void setNoticeCreateDate(Date noticeCreateDate) {
		this.noticeCreateDate = noticeCreateDate;
	}
	public Date getNoticeUpdateDate() {
		return noticeUpdateDate;
	}
	public void setNoticeUpdateDate(Date noticeUpdateDate) {
		this.noticeUpdateDate = noticeUpdateDate;
	}
	public Date getNoticeDeleteDate() {
		return noticeDeleteDate;
	}
	public void setNoticeDeleteDate(Date noticeDeleteDate) {
		this.noticeDeleteDate = noticeDeleteDate;
	}
	public String getNoticeStatus() {
		return noticeStatus;
	}
	public void setNoticeStatus(String noticeStatus) {
		this.noticeStatus = noticeStatus;
	}
	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticeWriterNo=" + noticeWriterNo + ", noticeWriter=" + noticeWriter
				+ ", noticeTypeNo=" + noticeTypeNo + ", noticeType=" + noticeType + ", noticeTitle=" + noticeTitle
				+ ", noticeContent=" + noticeContent + ", noticeCount=" + noticeCount + ", noticeCreateDate="
				+ noticeCreateDate + ", noticeUpdateDate=" + noticeUpdateDate + ", noticeDeleteDate=" + noticeDeleteDate
				+ ", noticeStatus=" + noticeStatus + "]";
	}
	
	
	
	
}
