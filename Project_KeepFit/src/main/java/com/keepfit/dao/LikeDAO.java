package com.keepfit.dao;

import java.util.List;

import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;


public interface LikeDAO {
	
	// 좋아요 추가
	public void insertLike(LikeVO vo);
		
	// 좋아요 삭제
	public void deleteLike(LikeVO vo);

	// 좋아요 개수 조회
	public int getLike(LikeVO vo);

}
