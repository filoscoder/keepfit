package com.keepfit.domain;

import java.util.Date;


// 댓글 관련 VO (Value Object)
public class LikeVO {

	private int 	like_id;	 // 좋아요 코드 (PK / SEQ)
	private int 	like_user;	 // 좋아요 작성자
	private int 	post_id;	 // 게시글 코드
	
	
	public int getLike_id() {
		return like_id;
	}
	public void setLike_id(int like_id) {
		this.like_id = like_id;
	}
	public int getLike_user() {
		return like_user;
	}
	public void setLike_user(int like_user) {
		this.like_user = like_user;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	

}