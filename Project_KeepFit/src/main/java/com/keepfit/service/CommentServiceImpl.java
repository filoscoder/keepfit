package com.keepfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepfit.dao.CommentDAOImpl;
import com.keepfit.dao.MemberDAOImpl;
import com.keepfit.domain.CommentVO;
import com.keepfit.domain.MemberVO;


@Service("commentService")
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentDAOImpl commentDAO;

	// 댓글 추가
	@Override
	public void insertComment(CommentVO vo) {
		commentDAO.insertComment(vo);		
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
	
	// 댓글 개수 조회
	@Override
	public int getComment(CommentVO vo) {
		return commentDAO.getComment(vo);
	}
	
	
}	// end of CommentServiceImpl