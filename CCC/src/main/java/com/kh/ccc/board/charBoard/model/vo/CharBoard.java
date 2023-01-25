package com.kh.ccc.board.charBoard.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CharBoard {
	
	private int 	boardNo;			//캐릭터 게시판 글번호
	private int 	charNo;				//캐릭터 번호
	private String	charName;			//캐릭터 이름
	private int 	boardWriterNo;		//작성자번호
	private String	boardWriterName;	//작성자 아이디
	private String 	boardTitle;			//글 제목
	private String 	boardContent;		//캐릭터 설명
	private int 	views;				//조회수
	private int 	like;				//좋아요
	private int		memberLike;			//로그인유저 좋아요 유무 (테이블에는 없음)
	private Date	createDate;			//작성날짜
	private String  changeName;			//바뀐 파일명 + 경로 (테이블에는 없음)
	private String 	status;				//상태값(Y/N)
	public CharBoard() {
		super();
	}
	public CharBoard(int boardNo, int charNo, String charName, int boardWriterNo, String boardWriterName,
			String boardTitle, String boardContent, int views, int like, int memberLike, Date createDate,
			String changeName, String status) {
		super();
		this.boardNo = boardNo;
		this.charNo = charNo;
		this.charName = charName;
		this.boardWriterNo = boardWriterNo;
		this.boardWriterName = boardWriterName;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.views = views;
		this.like = like;
		this.memberLike = memberLike;
		this.createDate = createDate;
		this.changeName = changeName;
		this.status = status;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public int getCharNo() {
		return charNo;
	}
	public void setCharNo(int charNo) {
		this.charNo = charNo;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public int getBoardWriterNo() {
		return boardWriterNo;
	}
	public void setBoardWriterNo(int boardWriterNo) {
		this.boardWriterNo = boardWriterNo;
	}
	public String getBoardWriterName() {
		return boardWriterName;
	}
	public void setBoardWriterName(String boardWriterName) {
		this.boardWriterName = boardWriterName;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getMemberLike() {
		return memberLike;
	}
	public void setMemberLike(int memberLike) {
		this.memberLike = memberLike;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getChangeName() {
		return changeName;
	}
	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CharBoard [boardNo=" + boardNo + ", charNo=" + charNo + ", charName=" + charName + ", boardWriterNo="
				+ boardWriterNo + ", boardWriterName=" + boardWriterName + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", views=" + views + ", like=" + like + ", memberLike="
				+ memberLike + ", createDate=" + createDate + ", changeName=" + changeName + ", status=" + status + "]";
	}
	
	
	
}
