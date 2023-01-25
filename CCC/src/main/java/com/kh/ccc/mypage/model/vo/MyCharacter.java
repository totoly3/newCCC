package com.kh.ccc.mypage.model.vo;

import java.sql.Date;

<<<<<<< HEAD

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
=======
//마이페이지 내 캐릭터
public class MyCharacter {

				
	private int cNo;		 //	C_NO	NUMBER
	private int mNo;		//	M_NO	NUMBER
	private String cName;		//	C_NAME	VARCHAR2(30 BYTE)
	private int cLike;		//	C_LIKE	NUMBER
	private String cContent; //	C_CONTENT	VARCHAR2(2000 BYTE)	
	private Date cCreateDate;		//	C_CREATE_DATE	DATE
	private String cStatus;		//	C_STATUS	VARCHAR2(1 BYTE)
	
	public MyCharacter() {
		super();
	}

	public MyCharacter(int cNo, int mNo, String cName, int cLike, String cContent, Date cCreateDate, String cStatus) {
		super();
		this.cNo = cNo;
		this.mNo = mNo;
		this.cName = cName;
		this.cLike = cLike;
		this.cContent = cContent;
		this.cCreateDate = cCreateDate;
		this.cStatus = cStatus;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcLike() {
		return cLike;
	}

	public void setcLike(int cLike) {
		this.cLike = cLike;
	}

	public String getcContent() {
		return cContent;
	}

	public void setcContent(String cContent) {
		this.cContent = cContent;
	}

	public Date getcCreateDate() {
		return cCreateDate;
	}

	public void setcCreateDate(Date cCreateDate) {
		this.cCreateDate = cCreateDate;
	}

	public String getcStatus() {
		return cStatus;
	}

	public void setcStatus(String cStatus) {
		this.cStatus = cStatus;
	}

	@Override
	public String toString() {
		return "MyCharacter [cNo=" + cNo + ", mNo=" + mNo + ", cName=" + cName + ", cLike=" + cLike + ", cContent="
				+ cContent + ", cCreateDate=" + cCreateDate + ", cStatus=" + cStatus + "]";
>>>>>>> refs/remotes/origin/ABC
	}
	
	
	
}
