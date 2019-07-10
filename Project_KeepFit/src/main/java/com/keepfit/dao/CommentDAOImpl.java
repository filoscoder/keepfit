package com.keepfit.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keepfit.domain.CommentVO;
import com.keepfit.domain.MemberVO;



@Repository("commentDAO")
public class CommentDAOImpl implements CommentDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;


	
	// 댓글 추가
	@Override
	public void insertComment(CommentVO vo) {
		System.out.println("===> Mybatis insertComment() 호출");
		mybatis.insert("db.insertComment", vo);		
	}
	
	// 댓글 수정
	@Override
	public void updateComment(CommentVO vo) {
		System.out.println("===> Mybatis updateComment() 호출");
		mybatis.update("db.updateComment", vo);		
	}

	// 댓글 삭제
	@Override
	public void deleteComment(CommentVO vo) {
		System.out.println("===> Mybatis deleteComment() 호출");
		mybatis.delete("db.deleteComment", vo);		
	}

	// 댓글 개수 조회
	@Override
	public int getComment(CommentVO vo) {
		System.out.println("===> Mybatis getComment() 호출");
		return mybatis.selectOne("db.getComment", vo);
	}

	// 총 댓글 조회
	@Override
	public List<CommentVO> getCommentList(CommentVO vo) {
		System.out.println("===> Mybatis getCommentList() 호출");
		return mybatis.selectList("db.getCommentList", vo);
	}
	
	
}	// end of CommentDAOImpl