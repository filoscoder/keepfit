package com.keepfit.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.MoodVO;



@Repository("moodDAO")
public class MoodDAOImpl implements MoodDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	// 선택 상태 조회
	@Override
	public MoodVO getMood(MoodVO vo) {
		System.out.println("===> Mybatis getMood() 호출");
		return mybatis.selectOne("db.getMood", vo);		
	}
	
	
}	// end of MoodDAOImpl