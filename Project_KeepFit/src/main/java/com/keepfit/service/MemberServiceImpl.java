package com.keepfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepfit.dao.MemberDAOImpl;
import com.keepfit.domain.MemberVO;


@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAOImpl memberDAO;


	@Override
	public void insertMember(MemberVO vo) {
		memberDAO.insertMember(vo);
		
	}

	@Override
	public void updateMember(MemberVO vo) {
		memberDAO.updateMember(vo);
		
	}

	@Override
	public void deleteMember(MemberVO vo) {
		memberDAO.deleteMember(vo);
		
	}

	@Override
	public MemberVO getMember(MemberVO vo) {		
		return memberDAO.getMember(vo);
	}

	@Override
	public List<MemberVO> getMemberList(MemberVO vo) {
		return memberDAO.getMemberList(vo);
	}

	@Override
	public MemberVO idCheck_Login(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO loginMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}