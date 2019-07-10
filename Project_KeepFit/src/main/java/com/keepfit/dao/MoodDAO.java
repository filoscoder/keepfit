package com.keepfit.dao;

import java.util.List;

import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.MoodVO;


public interface MoodDAO {
	
	// 선택 상태 조회
	public MoodVO getMood(MoodVO vo);

}
