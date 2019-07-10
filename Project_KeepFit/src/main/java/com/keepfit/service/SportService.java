package com.keepfit.service;

import java.util.List;

import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.MoodVO;
import com.keepfit.domain.SportVO;



public interface SportService {
	
	// CRUD 기능의 메소드 구현	
	// 선택 운동 조회
	SportVO getSport(SportVO vo);
}
