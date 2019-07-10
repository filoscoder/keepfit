package com.keepfit.domain;

import java.util.Date;


// 회원관련 VO (Value Object)
public class SportVO {

	private int 	sport_id;			// 운동 코드 (PK)
	private String 	sport_name;		// 운동 이름
	private int 	sport_type;			// 운동 종류 (1: 위치 / 2: 길찾기)
	private String 	calories;		// 운동 칼로리
	
	public int getSport_id() {
		return sport_id;
	}
	public void setSport_id(int sport_id) {
		this.sport_id = sport_id;
	}
	
	public String getSport_name() {
		return sport_name;
	}
	public void setSport_name(String sport_name) {
		this.sport_name = sport_name;
	}
	
	public int getSport_type() {
		return sport_type;
	}
	public void setSport_type(int sport_type) {
		this.sport_type = sport_type;
	}
	
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}	
	

}