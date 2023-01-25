package com.kh.ccc.board.notice.model.vo;



public class NoticeAttach {
//	NA_NO	NUMBER
//	N_NO	NUMBER
//	NA_ORIGIN_NAME	VARCHAR2(500 BYTE)
//	NA_CHANGE_NAME	VARCHAR2(500 BYTE)
//	NA_FILE_PATH	VARCHAR2(500 BYTE)
//	NA_STATUS	VARCHAR2(1 BYTE)
	private int noticeAttachNo;
	private int noticeNo;
	private String noticeAttachOriginName;
	private String noticeAttachChangeName;
	private String noticeAttachFilePath;
	private String noticeAttachStatus;
	public NoticeAttach() {
		super();
	}
	public NoticeAttach(int noticeAttachNo, int noticeNo, String noticeAttachOriginName, String noticeAttachChangeName,
			String noticeAttachFilePath, String noticeAttachStatus) {
		super();
		this.noticeAttachNo = noticeAttachNo;
		this.noticeNo = noticeNo;
		this.noticeAttachOriginName = noticeAttachOriginName;
		this.noticeAttachChangeName = noticeAttachChangeName;
		this.noticeAttachFilePath = noticeAttachFilePath;
		this.noticeAttachStatus = noticeAttachStatus;
	}
	@Override
	public String toString() {
		return "NoticeAttach [noticeAttachNo=" + noticeAttachNo + ", noticeNo=" + noticeNo + ", noticeAttachOriginName="
				+ noticeAttachOriginName + ", noticeAttachChangeName=" + noticeAttachChangeName
				+ ", noticeAttachFilePath=" + noticeAttachFilePath + ", noticeAttachStatus=" + noticeAttachStatus + "]";
	}
	
	
	
}
