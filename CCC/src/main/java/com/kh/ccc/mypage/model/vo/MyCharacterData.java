package com.kh.ccc.mypage.model.vo;

import java.sql.Date;

public class MyCharacterData {
	private int	charNo; //	C_NO	NUMBER	  캐릭터번호
	private	int memberNo;//	M_NO	NUMBER	 사용자번호
	private	String charName;//	C_NAME	VARCHAR2 캐릭터명
	private	int charLike;//	C_LIKE	NUMBER	 좋아요 수
	private	String charContent;//	C_CONTENT VARCHAR2 캐릭터 간단설명
	private	Date charCreateDate;//	C_CREATE_DATE DATE등록일
	private	String charStatus;//	C_STATUS VARCHAR2(1 BYTE)캐릭터 상태	
	public MyCharacterData() {
		super();
	}
	public int getCharNo() {
		return charNo;
	}
	public void setCharNo(int charNo) {
		this.charNo = charNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public int getCharLike() {
		return charLike;
	}
	public void setCharLike(int charLike) {
		this.charLike = charLike;
	}
	public String getCharContent() {
		return charContent;
	}
	public void setCharContent(String charContent) {
		this.charContent = charContent;
	}
	public Date getCharCreateDate() {
		return charCreateDate;
	}
	public void setCharCreateDate(Date charCreateDate) {
		this.charCreateDate = charCreateDate;
	}
	public String getCharStatus() {
		return charStatus;
	}
	public void setCharStatus(String charStatus) {
		this.charStatus = charStatus;
	}
	@Override
	public String toString() {
		return "MyCharacterData [charNo=" + charNo + ", memberNo=" + memberNo + ", charName=" + charName + ", charLike="
				+ charLike + ", charContent=" + charContent + ", charCreateDate=" + charCreateDate + ", charStatus="
				+ charStatus + "]";
	}
	
	
	
}
