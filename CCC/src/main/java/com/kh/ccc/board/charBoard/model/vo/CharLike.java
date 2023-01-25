package com.kh.ccc.board.charBoard.model.vo;

<<<<<<< HEAD


public class CharLike {

	private int 	memberNo;	//회원 번호
	private int 	charNo;		//캐릭터 번호
	private int		refBno;		//참조게시글 번호 (테이블에는 없음)
	private int 	charLike;	//좋아요 유무
	public CharLike() {
		super();
	}
	public CharLike(int memberNo, int charNo, int refBno, int charLike) {
		super();
		this.memberNo = memberNo;
		this.charNo = charNo;
		this.refBno = refBno;
		this.charLike = charLike;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getCharNo() {
		return charNo;
	}
	public void setCharNo(int charNo) {
		this.charNo = charNo;
	}
	public int getRefBno() {
		return refBno;
	}
	public void setRefBno(int refBno) {
		this.refBno = refBno;
	}
	public int getCharLike() {
		return charLike;
	}
	public void setCharLike(int charLike) {
		this.charLike = charLike;
	}
	@Override
	public String toString() {
		return "CharLike [memberNo=" + memberNo + ", charNo=" + charNo + ", refBno=" + refBno + ", charLike=" + charLike
				+ "]";
	}
	
	
	
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CharLike {

	private int 	memberNo;	//회원 번호
	private int 	charNo;		//캐릭터 번호
	private int		refBno;		//참조게시글 번호 (테이블에 없음)
	private int 	charLike;	//좋아요 유무
>>>>>>> refs/remotes/origin/ABC
	
}
