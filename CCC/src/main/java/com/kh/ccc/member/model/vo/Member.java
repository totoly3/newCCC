package com.kh.ccc.member.model.vo;

import java.sql.Date;
<<<<<<< HEAD




public class Member {
	
	private int memberNo;		//	M_NO	NUMBER
	private String memberId;		//	M_ID	VARCHAR2(20 BYTE)
	private String memberPwd;		//	M_PWD	VARCHAR2(20 BYTE)
	private String memberName;		//	M_NAME	VARCHAR2(30 BYTE)
	private int memberGradeNo;		//	MG_NO	NUMBER
	private String memberEmail; 	//	M_EMAIL	VARCHAR2(30 BYTE)
	private String memberPhone;	//	M_PHONE	VARCHAR2(20 BYTE)
	private String memberAddress; //	M_ADDRESS	VARCHAR2(100 BYTE)
	private String memberGender;		//	M_GENDER	VARCHAR2(20 BYTE)
	private int memberAge;		//	M_AGE	NUMBER
	private Date memberCreateDate;	//	M_CREATE_DATE	DATE
	private Date memberUpdateDate;	//	M_UPDATE_DATE	DATE
	private Date memberDeleteDate;	//	M_DELETE_DATE	DATE
	private int memberPoint;		//	M_POINT	NUMBER
	private String memberStatus;	 //M_STATUS	VARCHAR2(1 BYTE)	
	public Member() {
		super();
	}
	public Member(int memberNo, String memberId, String memberPwd, String memberName, int memberGradeNo,
			String memberEmail, String memberPhone, String memberAddress, String memberGender, int memberAge,
			Date memberCreateDate, Date memberUpdateDate, Date memberDeleteDate, int memberPoint, String memberStatus) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberGradeNo = memberGradeNo;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberGender = memberGender;
		this.memberAge = memberAge;
		this.memberCreateDate = memberCreateDate;
		this.memberUpdateDate = memberUpdateDate;
		this.memberDeleteDate = memberDeleteDate;
		this.memberPoint = memberPoint;
		this.memberStatus = memberStatus;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberGradeNo() {
		return memberGradeNo;
	}
	public void setMemberGradeNo(int memberGradeNo) {
		this.memberGradeNo = memberGradeNo;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	public Date getMemberCreateDate() {
		return memberCreateDate;
	}
	public void setMemberCreateDate(Date memberCreateDate) {
		this.memberCreateDate = memberCreateDate;
	}
	public Date getMemberUpdateDate() {
		return memberUpdateDate;
	}
	public void setMemberUpdateDate(Date memberUpdateDate) {
		this.memberUpdateDate = memberUpdateDate;
	}
	public Date getMemberDeleteDate() {
		return memberDeleteDate;
	}
	public void setMemberDeleteDate(Date memberDeleteDate) {
		this.memberDeleteDate = memberDeleteDate;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName="
				+ memberName + ", memberGradeNo=" + memberGradeNo + ", memberEmail=" + memberEmail + ", memberPhone="
				+ memberPhone + ", memberAddress=" + memberAddress + ", memberGender=" + memberGender + ", memberAge="
				+ memberAge + ", memberCreateDate=" + memberCreateDate + ", memberUpdateDate=" + memberUpdateDate
				+ ", memberDeleteDate=" + memberDeleteDate + ", memberPoint=" + memberPoint + ", memberStatus="
				+ memberStatus + "]";
	}
	
	
	

	
=======

public class Member {
	
	private int mNo;		//	M_NO	NUMBER
	private String mId;		//	M_ID	VARCHAR2(20 BYTE)
	private String mPwd;		//	M_PWD	VARCHAR2(20 BYTE)
	private String mName;		//	M_NAME	VARCHAR2(30 BYTE)
	private int mgNo;		//	MG_NO	NUMBER
	private String mEmail; 	//	M_EMAIL	VARCHAR2(30 BYTE)
	private String mPhone;	//	M_PHONE	VARCHAR2(20 BYTE)
	private String mAddress; //	M_ADDRESS	VARCHAR2(100 BYTE)
	private String mGender;		//	M_GENDER	VARCHAR2(20 BYTE)
	private int mAge;		//	M_AGE	NUMBER
	private Date mCreateDate;	//	M_CREATE_DATE	DATE
	private Date mUpdateDate;	//	M_UPDATE_DATE	DATE
	private Date mDeleteDate;	//	M_DELETE_DATE	DATE
	private int mPoint;		//	M_POINT	NUMBER
	private String mStatus;	 //M_STATUS	VARCHAR2(1 BYTE)	
	
	
	
	public Member() {
		super();
	}



	public Member(int mNo, String mId, String mPwd, String mName, int mgNo, String mEmail, String mPhone,
			String mAddress, String mGender, int mAge, Date mCreateDate, Date mUpdateDate, Date mDeleteDate, int mPoint,
			String mStatus) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mPwd = mPwd;
		this.mName = mName;
		this.mgNo = mgNo;
		this.mEmail = mEmail;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
		this.mGender = mGender;
		this.mAge = mAge;
		this.mCreateDate = mCreateDate;
		this.mUpdateDate = mUpdateDate;
		this.mDeleteDate = mDeleteDate;
		this.mPoint = mPoint;
		this.mStatus = mStatus;
	}



	public int getmNo() {
		return mNo;
	}



	public void setmNo(int mNo) {
		this.mNo = mNo;
	}



	public String getmId() {
		return mId;
	}



	public void setmId(String mId) {
		this.mId = mId;
	}



	public String getmPwd() {
		return mPwd;
	}



	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}



	public String getmName() {
		return mName;
	}



	public void setmName(String mName) {
		this.mName = mName;
	}



	public int getMgNo() {
		return mgNo;
	}



	public void setMgNo(int mgNo) {
		this.mgNo = mgNo;
	}



	public String getmEmail() {
		return mEmail;
	}



	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}



	public String getmPhone() {
		return mPhone;
	}



	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}



	public String getmAddress() {
		return mAddress;
	}



	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}



	public String getmGender() {
		return mGender;
	}



	public void setmGender(String mGender) {
		this.mGender = mGender;
	}



	public int getmAge() {
		return mAge;
	}



	public void setmAge(int mAge) {
		this.mAge = mAge;
	}



	public Date getmCreateDate() {
		return mCreateDate;
	}



	public void setmCreateDate(Date mCreateDate) {
		this.mCreateDate = mCreateDate;
	}



	public Date getmUpdateDate() {
		return mUpdateDate;
	}



	public void setmUpdateDate(Date mUpdateDate) {
		this.mUpdateDate = mUpdateDate;
	}



	public Date getmDeleteDate() {
		return mDeleteDate;
	}



	public void setmDeleteDate(Date mDeleteDate) {
		this.mDeleteDate = mDeleteDate;
	}



	public int getmPoint() {
		return mPoint;
	}



	public void setmPoint(int mPoint) {
		this.mPoint = mPoint;
	}



	public String getmStatus() {
		return mStatus;
	}



	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}


	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mPwd=" + mPwd + ", mName=" + mName + ", mgNo=" + mgNo
				+ ", mEmail=" + mEmail + ", mPhone=" + mPhone + ", mAddress=" + mAddress + ", mGender=" + mGender
				+ ", mAge=" + mAge + ", mCreateDate=" + mCreateDate + ", mUpdateDate=" + mUpdateDate + ", mDeleteDate="
				+ mDeleteDate + ", mPoint=" + mPoint + ", mStatus=" + mStatus + "]";
	}
	
	


>>>>>>> refs/remotes/origin/ABC
}
