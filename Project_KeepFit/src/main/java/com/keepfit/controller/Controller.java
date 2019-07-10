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
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = {"signup.do"})
	public void test(MemberVO vo) {
		memberService.insertMember(vo); // 지금은 vo가 비어있는 상태
		
		// (1) Model
		// (2) ModelAndView
		// (3) 함수위에 @ModelAttribute
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.jsp");
	}


	
	
}

