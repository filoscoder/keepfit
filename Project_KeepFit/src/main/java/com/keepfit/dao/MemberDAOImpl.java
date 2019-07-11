package com.keepfit.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keepfit.domain.MemberVO;



@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	// 가입 시 id 중복체크 & 로그인 시 id 체크
	@Override	
	public MemberVO idCheck(MemberVO vo) {
		System.out.println("===> MemberMapper idCheck 호출");
		return mybatis.selectOne("db.idCheck", vo);
	}
	
	// 회원 가입
	@Override
	public void insertMember(MemberVO vo) {
		System.out.println("===> Mybatis insertMember() 호출");
		mybatis.insert("db.insertMember", vo);		
	}

	// 회원 정보 수정
	@Override
	public void updateMember(MemberVO vo) {
		System.out.println("===> Mybatis updateMember() 호출");
		mybatis.update("db.updateMember", vo);
		
	}

	// 회원 탈퇴
	@Override
	public void deleteMember(MemberVO vo) {
		System.out.println("===> Mybatis deleteMember() 호출");
		mybatis.delete("db.deleteMember", vo);
		
	}
	
	// 회원 상세 조회
	@Override
	public MemberVO getMember(MemberVO vo) {
		System.out.println("===> Mybatis getMember() 호출");
		return (MemberVO) mybatis.selectOne("db.getMember", vo);
	}

	// 다수 회원 조회
	@Override
	public List<MemberVO> getMemberList(MemberVO vo) {
		System.out.println("===> Mybatis getMemberList() 호출");
		return mybatis.selectList("db.getMemberList", vo);
	}

	@Override
	public MemberVO loginMember(MemberVO vo) {
		System.out.println("===> Mybatis getMember() 호출");
		MemberVO login = new MemberVO();
		return (MemberVO) mybatis.selectOne("db.loginMember", vo);
	}
	
	
}	// end of MemberDAOImpl