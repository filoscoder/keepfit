package com.keepfit.dao;

import java.util.List;

import com.keepfit.domain.CommentVO;
import com.keepfit.domain.MemberVO;


public interface CommentDAO {
	
	// 댓글 추가
	public int insertComment(CommentVO vo);
	
	// 댓글 수정
	public void updateComment(CommentVO vo) ;
	
	// 댓글 삭제
	public void deleteComment(CommentVO vo);

	// 댓글 개수 조회
	public CommentVO getComment(CommentVO vo);
	
	// 총 댓글 조회
	public List<CommentVO> getCommentList(CommentVO vo);
}
