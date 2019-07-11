package com.keepfit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.keepfit.dao.PostDAO;
import com.keepfit.domain.PostVO;


@Service("postService")
public class PostServiceImpl implements PostService {
	
	@Autowired
	private PostDAO postDAO;


	@Override
	public int insertPost(PostVO vo) {
		return postDAO.insertPost(vo);
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