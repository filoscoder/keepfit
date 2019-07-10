package com.keepfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepfit.dao.LikeDAOImpl;
import com.keepfit.dao.MemberDAOImpl;
import com.keepfit.domain.LikeVO;
import com.keepfit.domain.MemberVO;


@Service("likeService")
public class LikeServiceImpl implements LikeService {
	
	@Autowired
	private LikeDAOImpl likeDAO;


	@Override
	public void insertLike(LikeVO vo) {
		likeDAO.insertLike(vo);		
	}

	@Override
	public void deleteLike(LikeVO vo) {
		likeDAO.deleteLike(vo);		
	}

	@Override
	public int getLike(LikeVO vo) {		
		return likeDAO.getLike(vo);
	}
	
	
}	// end of LikeServiceImpl