package com.keepfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepfit.dao.LikeDAOImpl;
import com.keepfit.dao.MemberDAOImpl;
import com.keepfit.dao.MoodDAOImpl;
import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.MoodVO;


@Service("moodService")
public class MoodServiceImpl implements MoodService {
	
	@Autowired
	private MoodDAOImpl moodDAO;


	@Override
	public MoodVO getMood(MoodVO vo) {
		return moodDAO.getMood(vo);
	}
	
	
}	// end of MoodServiceImpl