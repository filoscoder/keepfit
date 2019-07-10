package com.keepfit.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.keepfit.domain.CommentVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.service.CommentService;
import com.keepfit.service.MemberService;

@org.springframework.stereotype.Controller
public class Controller {

	// Service 객체생성
	@Autowired
	private MemberService memberService;
	private CommentService commentService;

	// Servlet ModelAndView 생성
	ModelAndView mv = new ModelAndView();

	/**************************************************************************************************
	 * REQUEST HANDLERS
	 *************************************************************************************************/
	@RequestMapping(value = { "login.do" })
	public ModelAndView login(MemberVO vo) {
		// [MEMBER DB] 에서  [email]과 [password] 확인
		MemberVO logUser = memberService.loginMember(vo);

		if (logUser != null) {
			if (vo.getMember_email().equals(logUser.getMember_email())
					&& vo.getMember_pass().equals(logUser.getMember_pass())) {
				mv.addObject("logged", "1");
				System.out.println("로그인 성공 ");
			}
		} else {
			mv.addObject("logged", "0");
			System.out.println("로그인 실패 ");
		}
		mv.addObject("member", vo);
		mv.setViewName("TEST-login");
		return mv;
	}

	@RequestMapping(value = {"comment.do"})
	public ModelAndView comment(CommentVO vo, WebRequest request) {
		// [COMMENT DB]에  [post_id]의 댓글을 모두 조회
		List<CommentVO> commentList = commentService.getCommentList(vo);
		
		if (commentList != null) {
			mv.addObject("commentList", commentList);
			mv.addObject("commentStatus", "1");
			System.out.println("댓글 조회");

		} else {
			mv.addObject("commentStatus", "0");
			System.out.println("댓글 없음");
		}
		mv.setViewName("TEST-comment");
		return mv;		
	}
	
	
	@RequestMapping(value = { "signup.do" })
	public ModelAndView test(MemberVO vo) {
		memberService.insertMember(vo); // 지금은 vo가 비어있는 상태

		// (1) Model
		// (2) ModelAndView
		// (3) 함수위에 @ModelAttribute
		mv.setViewName("home");
		return mv;
	}
	
	
	

}
