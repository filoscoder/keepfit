package com.keepfit.service;

import java.util.List;

import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.MoodVO;



public interface MoodService {
	
	// CRUD 기능의 메소드 구현	
	// 선택 상태 조회
	MoodVO getMood(MoodVO vo);
}
