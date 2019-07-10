package com.keepfit.service;

import java.util.List;

import com.keepfit.domain.MemberVO;



public interface MemberService {
	
	// CRUD 기능의 메소드 구현
		// 기존회원 로그인
		MemberVO loginMember(MemberVO vo);
	
		// 회원 가입
		void insertMember(MemberVO vo);
		
		// 회원 정보 수정
		void updateMember(MemberVO vo) ;
		
		// 회원 탈퇴
		void deleteMember(MemberVO vo);

		// 회원 상세 조회
		MemberVO getMember(MemberVO vo);

		// 다수 회원 조회
		List<MemberVO> getMemberList(MemberVO vo);

}
