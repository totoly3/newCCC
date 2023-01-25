package com.kh.ccc.mypage.model.vo;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//마이페이지 내 캐릭터
public class MyCharacter {

				
//	private int characterNo;		 //	C_NO	NUMBER
//	private int memberNo;		//	M_NO	NUMBER
//	private String characterName;		//	C_NAME	VARCHAR2(30 BYTE)
//	private int characterLike;		//	C_LIKE	NUMBER
//	private String characterContent; //	C_CONTENT	VARCHAR2(2000 BYTE)	
//	private Date characterCreateDate;		//	C_CREATE_DATE	DATE
//	private String characterStatus;		//	C_STATUS	VARCHAR2(1 BYTE)
	
	//파일join용 추가 필드 
	private int myCharAttachNo;		//	MCA_NO	NUMBER
	private	String originName; //	MCA_ORIGIN_NAME	VARCHAR2(300 BYTE)
	private	String changeName; //	MCA_CHANGE_NAME	VARCHAR2(300 BYTE)
	private	int	myCharAttachLevel; //	MCA_CA_LEVEL	NUMBER
	private	Date myCharAttachCreateDate;//	MCA_CREATE_DATE	DATE
	private	String myCharAttachStatus;//	MCA_STATUS	VARCHAR2(1 BYTE)
	public MyCharacter() {
		super();
	}
	public MyCharacter(int myCharAttachNo, String originName, String changeName, int myCharAttachLevel,
			Date myCharAttachCreateDate, String myCharAttachStatus) {
		super();
		this.myCharAttachNo = myCharAttachNo;
		this.originName = originName;
		this.changeName = changeName;
		this.myCharAttachLevel = myCharAttachLevel;
		this.myCharAttachCreateDate = myCharAttachCreateDate;
		this.myCharAttachStatus = myCharAttachStatus;
	}
	public int getMyCharAttachNo() {
		return myCharAttachNo;
	}
	public void setMyCharAttachNo(int myCharAttachNo) {
		this.myCharAttachNo = myCharAttachNo;
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
	public int getMyCharAttachLevel() {
		return myCharAttachLevel;
	}
	public void setMyCharAttachLevel(int myCharAttachLevel) {
		this.myCharAttachLevel = myCharAttachLevel;
	}
	public Date getMyCharAttachCreateDate() {
		return myCharAttachCreateDate;
	}
	public void setMyCharAttachCreateDate(Date myCharAttachCreateDate) {
		this.myCharAttachCreateDate = myCharAttachCreateDate;
	}
	public String getMyCharAttachStatus() {
		return myCharAttachStatus;
	}
	public void setMyCharAttachStatus(String myCharAttachStatus) {
		this.myCharAttachStatus = myCharAttachStatus;
	}
	@Override
	public String toString() {
		return "MyCharacter [myCharAttachNo=" + myCharAttachNo + ", originName=" + originName + ", changeName="
				+ changeName + ", myCharAttachLevel=" + myCharAttachLevel + ", myCharAttachCreateDate="
				+ myCharAttachCreateDate + ", myCharAttachStatus=" + myCharAttachStatus + "]";
	}
	
	
	
}
