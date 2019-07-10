package com.keepfit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.keepfit.domain.MemberVO;
import com.keepfit.service.MemberService;


@org.springframework.stereotype.Controller
public class Controller {
	
	// Service 객체생성
	@Autowired
	private MemberService memberService;
	
	// Servlet ModelAndView 생성
	ModelAndView mv = new ModelAndView();
	
/**************************************************************************************************
 *											 REQUEST HANDLERS 
 *************************************************************************************************/
	@RequestMapping(value = {"login.fit"})
	public ModelAndView login(MemberVO vo) {
		MemberVO logUser = memberService.getMember(vo);
		
		if (logUser.getMember_email().equals(vo.getMember_email()) 
				&& logUser.getMember_pass().equals(vo.getMember_pass())) {
			mv.addObject("logUser", logUser);
			mv.setViewName("TEST-login");
		} else {
			mv.addObject("notUser", vo);
			mv.setViewName("TESTlogin");
		}		
		return mv;
	}
	
	@RequestMapping(value = {"signup.do"})
	public ModelAndView test(MemberVO vo) {
		memberService.insertMember(vo); // 지금은 vo가 비어있는 상태
		
		// (1) Model
		// (2) ModelAndView
		// (3) 함수위에 @ModelAttribute
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}


	
	
}

