package com.keepfit.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;



@Repository("likeDAO")
public class LikeDAOImpl implements LikeDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	// 좋아요 추가
	@Override
	public void insertLike(LikeVO vo) {
		System.out.println("===> Mybatis insertLike() 호출");
		mybatis.insert("db.insertLike", vo);			
	}
	
	// 좋아요 삭제
	@Override
	public void deleteLike(LikeVO vo) {
		System.out.println("===> Mybatis deleteLike() 호출");
		mybatis.delete("db.deleteLike", vo);		
	}

	// 좋아요 개수 조회
	@Override
	public int getLike(LikeVO vo) {
		System.out.println("===> Mybatis getLike() 호출");
		return mybatis.selectOne("db.getLike", vo);
	}
	
	
}	// end of LikeDAOImpl