package com.keepfit.dao;

import java.util.List;

import com.keepfit.domain.SportVO;


public interface SportDAO {
	
	// 선택 운동 조회
	public SportVO getSport(SportVO vo);

}
