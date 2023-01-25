package com.kh.ccc.board.charBoard.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CharAttach {

	private int 	fileNo;		//파일번호
	private int 	refBno;		//참조게시글 번호
	private String 	originName;	//원본파일명
	private String 	changeName;	//바뀐파일명
	private int 	level;		//파일레벨 (1:대표/2:일반)
	private Date 	createDate;	//파일등록일
	private String 	status;		//상태값(Y/N)
	public CharAttach() {
		super();
	}
	public CharAttach(int fileNo, int refBno, String originName, String changeName, int level, Date createDate,
			String status) {
		super();
		this.fileNo = fileNo;
		this.refBno = refBno;
		this.originName = originName;
		this.changeName = changeName;
		this.level = level;
		this.createDate = createDate;
		this.status = status;
	}
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	public int getRefBno() {
		return refBno;
	}
	public void setRefBno(int refBno) {
		this.refBno = refBno;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public String getChangeName() {
		return changeName;
	}
	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
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
	@Override
	public String toString() {
		return "CharAttach [fileNo=" + fileNo + ", refBno=" + refBno + ", originName=" + originName + ", changeName="
				+ changeName + ", level=" + level + ", createDate=" + createDate + ", status=" + status + "]";
	}
	
	
	
}
