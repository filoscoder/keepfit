package com.keepfit.domain;

import java.util.Date;


// 회원관련 VO (Value Object)
public class MemberVO {
	
	private int 	member_id;		// 회원 코드 (PK)
	private String 	member_email;	// 회원 매일
	private String	member_pass;	// 회원 비밀번호 (if (SSO) { "SSO" })
	private String 	member_channel;	// 회원 가입경로 (SSO || NATIVE)
	private String 	member_nick;	// 회원 별칭 (UK)
	private String 	member_bio;		// 프로필 메시지
	private String 	now_weigth;		// 현재 몸무게
	private String 	goal_weight;	// 목표 몸무게
	private String 	sport1;			// 운동1
	private String 	sport2;			// 운동2
	private String 	sport3;			// 운동3
	private Date 	regDate;		// 회원가입 일자
	private Date	upDate;			// 회원수정 일자

	
	
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_pass() {
		return member_pass;
	}
	public void setMember_pass(String member_pass) {
		this.member_pass = member_pass;
	}

	public String getMember_channel() {
		return member_channel;
	}
	public void setMember_channel(String member_channel) {
		this.member_channel = member_channel;
	}

	public String getMember_nick() {
		return member_nick;
	}
	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}

	public String getMember_bio() {
		return member_bio;
	}
	public void setMember_bio(String member_bio) {
		this.member_bio = member_bio;
	}

	public String getNow_weigth() {
		return now_weigth;
	}
	public void setNow_weigth(String now_weigth) {
		this.now_weigth = now_weigth;
	}

	public String getGoal_weight() {
		return goal_weight;
	}
	public void setGoal_weight(String goal_weight) {
		this.goal_weight = goal_weight;
	}

	public String getSport1() {
		return sport1;
	}
	public void setSport1(String sport1) {
		this.sport1 = sport1;
	}

	public String getSport2() {
		return sport2;
	}
	public void setSport2(String sport2) {
		this.sport2 = sport2;
	}

	public String getSport3() {
		return sport3;
	}
	public void setSport3(String sport3) {
		this.sport3 = sport3;
	}

	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpDate() {
		return upDate;
	}
	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}


	@Override
	public String toString() {
		return "[MemberVO]"
				+"\n id="+ member_id
				+"\n email=" + member_email 
				+"\n pw=" + member_pass
				+"\n nick=" + member_nick
				+"\n bio=" + member_bio
				+"\n 현재 몸무게=" + now_weigth
				+"\n 목표 몸무게=" + goal_weight				
				+"\n sport1=" + sport1
				+"\n sport2=" + sport2
				+"\n sport3=" + sport3
				+"\n 가입일=" + regDate;
	}
}