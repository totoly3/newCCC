package com.kh.ccc.board.charBoard.model.vo;

import java.sql.Date;




public class Character {
	
	private int 	charNo;			//캐릭터 번호
	private int 	memberNo;		//창작자 번호
	private int 	refBno;			//참조게시글 번호
	private String 	charName;		//캐릭터 이름
	private String	charContent;	//캐릭터 간단 설명
	private int 	like;			//좋아요
	private Date 	createDate;		//캐릭터 등록일
	private String 	status;			//캐릭터 상태
	private String  changeName; 	//첨부파일명    
	public Character() {
		super();
	}
	public Character(int charNo, int memberNo, int refBno, String charName, String charContent, int like,
			Date createDate, String status, String changeName) {
		super();
		this.charNo = charNo;
		this.memberNo = memberNo;
		this.refBno = refBno;
		this.charName = charName;
		this.charContent = charContent;
		this.like = like;
		this.createDate = createDate;
		this.status = status;
		this.changeName = changeName;
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
	public int getRefBno() {
		return refBno;
	}
	public void setRefBno(int refBno) {
		this.refBno = refBno;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public String getCharContent() {
		return charContent;
	}
	public void setCharContent(String charContent) {
		this.charContent = charContent;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChangeName() {
		return changeName;
	}
	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}
	@Override
	public String toString() {
		return "Character [charNo=" + charNo + ", memberNo=" + memberNo + ", refBno=" + refBno + ", charName="
				+ charName + ", charContent=" + charContent + ", like=" + like + ", createDate=" + createDate
				+ ", status=" + status + ", changeName=" + changeName + "]";
	}
	
	
	
}
