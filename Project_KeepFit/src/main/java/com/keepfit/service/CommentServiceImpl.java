package com.keepfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepfit.dao.CommentDAO;
import com.keepfit.domain.CommentVO;


@Service("commentService")
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentDAO commentDAO;

	// 댓글 추가
	// 댓글 개수 조회
	@Override
	public int insertComment(CommentVO vo) {
		return commentDAO.insertComment(vo);		
	}

	// 댓글 수정
	@Override
	public void updateComment(CommentVO vo) {
		commentDAO.updateComment(vo);		
	}

	// 댓글 삭제
	@Override
	public void deleteComment(CommentVO vo) {
		commentDAO.deleteComment(vo);		
	}
	
	// 댓글 상세 표시
	@Override
	public CommentVO getComment(CommentVO vo) {
		return commentDAO.getComment(vo);
	}
	
	// 댓글 모두 조회
	@Override
	public List<CommentVO> getCommentList(CommentVO vo) {
		return commentDAO.getCommentList(vo);
	}
	
	
}	// end of CommentServiceImpl