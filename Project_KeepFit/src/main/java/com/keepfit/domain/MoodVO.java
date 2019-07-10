package com.keepfit.domain;

import java.util.Date;


// 포스팅 상태-기분 관련 VO (Value Object)
public class MoodVO {

	private int		mood_id;		// 상태 코드 (PK)
	private String 	mood_name;		// 상태 이름
	private String	mood_img;		// 상태 이미지 경로
	private String	mood_message;	// 상태 메시지

	public int getMood_id() {
		return mood_id;
	}
	public void setMood_id(int mood_id) {
		this.mood_id = mood_id;
	}

	public String getMood_name() {
		return mood_name;
	}
	public void setMood_name(String mood_name) {
		this.mood_name = mood_name;
	}

	public String getMood_img() {
		return mood_img;
	}
	public void setMood_img(String mood_img) {
		this.mood_img = mood_img;
	}

	public String getMood_message() {
		return mood_message;
	}
	public void setMood_message(String mood_message) {
		this.mood_message = mood_message;
	}

	
}