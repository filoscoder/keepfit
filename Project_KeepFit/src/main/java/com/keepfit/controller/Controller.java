package com.keepfit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
   // DB 갖다오지 않는 함수 중 일괄 처리하는
	    @RequestMapping(value = "{url}.do")
	    public String common(@PathVariable String url) {
	        System.out.println("common 호출!");
	        return url;
	    }	    

	
	
	@RequestMapping(value = {"login.do"})
	public ModelAndView login(MemberVO vo) {
		// [MEMBER DB] 에서  [email]과 [password] 확인
		MemberVO logUser = memberService.loginMember(vo);
		
		if (logUser != null) {
            if (vo.getMember_email().equals(logUser.getMember_email())
                    && vo.getMember_pass().equals(logUser.getMember_pass())) {
                mv.addObject("logged", "1");
                System.out.println("성공 ");
            }
        } else {
            mv.addObject("logged", "0");
            System.out.println("실패 ");
        }
        mv.addObject("member", vo);
        mv.setViewName("TEST-login");
        return mv;
    }
	
	@RequestMapping(value = {"signup.do"})
	public ModelAndView test(MemberVO vo) {
		System.out.println(vo.toString());
		memberService.insertMember(vo); // 지금은 vo가 비어있는 상태
		
		// (1) Model
		// (2) ModelAndView
		// (3) 함수위에 @ModelAttribute
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value="idCheck.fit", produces="application/text; charset=UTF-8")
	@ResponseBody	// ajax인 경우 반드시 @ResponseBody를 추가해줘야 비동기 통신 가능
	public String idCheck(MemberVO vo) {
		// String userId를 인자로 받아도 됨
		MemberVO memberVO = memberService.idCheck_Login(vo);
		String result = "ID 사용 가능합니다.";
		if(memberVO !=null) result = "중복된 ID입니다.";

		return result;
	}

	
	
}

