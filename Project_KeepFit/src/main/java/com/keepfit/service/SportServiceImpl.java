package com.keepfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepfit.dao.LikeDAOImpl;
import com.keepfit.dao.MemberDAOImpl;
import com.keepfit.dao.MoodDAOImpl;
import com.keepfit.dao.SportDAOImpl;
import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.MoodVO;
import com.keepfit.domain.SportVO;


@Service("sportService")
public class SportServiceImpl implements SportService {
	
	@Autowired
	private SportDAOImpl sportDAO;


	@Override
	public SportVO getSport(SportVO vo) {
		return sportDAO.getSport(vo);
	}

	
	
}	// end of MoodServiceImpl