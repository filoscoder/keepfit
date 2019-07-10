package com.keepfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepfit.dao.MemberDAOImpl;
import com.keepfit.dao.PostDAOImpl;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.PostVO;


@Service("postService")
public class PostServiceImpl implements PostService {
	
	@Autowired
	private PostDAOImpl postDAO;


	@Override
	public void insertPost(PostVO vo) {
		postDAO.insertPost(vo);
	}

	@Override
	public void updatePost(PostVO vo) {
		postDAO.updatePost(vo);		
	}

	@Override
	public void deletePost(PostVO vo) {
		postDAO.deletePost(vo);		
	}

	@Override
	public PostVO getPost(PostVO vo) {
		return postDAO.getPost(vo);
	}

	@Override
	public List<PostVO> getPostList(PostVO vo) {
		return postDAO.getPostList(vo);
	}
	
	
}	// end of PostServiceImpl