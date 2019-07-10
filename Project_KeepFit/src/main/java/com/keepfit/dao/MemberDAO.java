package com.keepfit.dao;

import java.util.List;

import com.keepfit.domain.MemberVO;


public interface MemberDAO {
	
	// 회원 가입
	public void insertMember(MemberVO vo);
	
	// 회원 정보 수정
	public void updateMember(MemberVO vo) ;
	
	// 회원 탈퇴
	public void deleteMember(MemberVO vo);

	// 회원 상세 조회
	public MemberVO getMember(MemberVO vo);

	// 다수 회원 조회
	public List<MemberVO> getMemberList(MemberVO vo);
}
