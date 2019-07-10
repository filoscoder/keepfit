package com.keepfit.service;

import java.util.List;

import com.keepfit.domain.MemberVO;
import com.keepfit.domain.PostVO;



public interface PostService {
	
	// CRUD 기능의 메소드 구현	
	// 게시물 등록
	void insertPost(PostVO vo);
	
	// 게시물 수정
	void updatePost(PostVO vo) ;
	
	// 게시물 삭제
	void deletePost(PostVO vo);

	// 게시물 상세 조회
	PostVO getPost(PostVO vo);

	// id별 총 게시물 조회
	List<PostVO> getPostList(PostVO vo);
}
