package com.keepfit.domain;

import java.util.Date;


// 댓글 관련 VO (Value Object)
public class CommentVO {

	private int 	comment_id;		 // 댓글 코드 (PK)
	private int 	comment_writer;	 // 댓글 작성자
	private String 	comment_content; // 댓글 내용
	private int 	post_id;		 // 게시글 코드

	
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public int getComment_writer() {
		return comment_writer;
	}
	public void setComment_writer(int comment_writer) {
		this.comment_writer = comment_writer;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	

}