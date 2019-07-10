package com.keepfit.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.MoodVO;
import com.keepfit.domain.SportVO;



@Repository("sportDAO")
public class SportDAOImpl implements SportDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	// 선택 운동 조회
	@Override
	public SportVO getSport(SportVO vo) {
		System.out.println("===> Mybatis getSport() 호출");
		return mybatis.selectOne("db.getSport", vo);		
	}


	
}	// end of MoodDAOImpl