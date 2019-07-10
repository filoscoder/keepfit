package com.keepfit.service;

import java.util.List;

import com.keepfit.domain.CommentVO;
import com.keepfit.domain.MemberVO;



public interface CommentService {
	
	// CRUD 기능의 메소드 구현	
	
	// 댓글 추가
	void insertComment(CommentVO vo);
	
	// 댓글 수정
	void updateComment(CommentVO vo) ;
	
	// 댓글 삭제
	void deleteComment(CommentVO vo);

	// 댓글 개수 조회
	int getComment(CommentVO vo);
	
	// 게시물의 댓글 list 조회
	List<CommentVO> getCommentList(CommentVO vo);
}
