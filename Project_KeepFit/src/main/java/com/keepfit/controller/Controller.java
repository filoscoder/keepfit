package com.keepfit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.keepfit.domain.CommentVO;
import com.keepfit.domain.MemberVO;
import com.keepfit.domain.PostVO;
import com.keepfit.service.CommentService;
import com.keepfit.service.MemberService;
import com.keepfit.service.PostService;

@org.springframework.stereotype.Controller
public class Controller {

	// Service 객체생성
	@Autowired
	private MemberService memberService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private PostService postService;

	// Servlet ModelAndView 생성
	ModelAndView mv = new ModelAndView();

	/**************************************************************************************************
	 * REQUEST HANDLERS
	 *************************************************************************************************/
	// DB 갖다오지 않는 함수 일괄 처리하는
	@RequestMapping(value = "{url}.do")
	public String common(@PathVariable String url) {
		System.out.println("common 호출!");
		return url;
	}

	/**************************************************************************************************
	 * [로그인] HANDLERS
	 *************************************************************************************************/
	@RequestMapping(value = { "login.do" })
	public ModelAndView login(MemberVO vo) {
		// [MEMBER DB] 에서 [email]과 [password] 확인
		MemberVO logUser = memberService.loginMember(vo);

		if (logUser != null) {
			if (vo.getMember_email().equals(logUser.getMember_email())
					&& vo.getMember_pass().equals(logUser.getMember_pass())) {
				mv.addObject("logged", "1"); // ****TEAM-FRONT: view url 수정가능
				System.out.println("성공 ");
			}
		} else {
			mv.addObject("logged", "0"); // ****TEAM-FRONT: view url 수정가능
			System.out.println("실패 ");
		}
		mv.addObject("member", vo); // 사용자 입력 값이 들어있음 : EMAIL / PW
		mv.setViewName("TEST-login"); // ****TEAM-FRONT: view url 수정가능
		return mv;
	}

	/**************************************************************************************************
	 * [회원가입] HANDLERS
	 *************************************************************************************************/
	@RequestMapping(value = { "signup.do" })
	public ModelAndView test(MemberVO vo) {
		System.out.println(vo.toString());
		memberService.insertMember(vo); // 지금은 vo가 비어있는 상태

		// (1) Model
		// (2) ModelAndView
		// (3) 함수위에 @ModelAttribute
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "idCheck.fit", produces = "application/text; charset=UTF-8")
	@ResponseBody // ajax인 경우 반드시 @ResponseBody를 추가해줘야 비동기 통신 가능
	public String idCheck(MemberVO vo) {
		// String userId를 인자로 받아도 됨
		MemberVO memberVO = memberService.idCheck_Login(vo);
		String result = "ID 사용 가능합니다.";
		if (memberVO != null)
			result = "중복된 ID입니다.";

		return result;
	}

	/**************************************************************************************************
	 * [댓글] HANDLERS
	 *************************************************************************************************/
	// post_id 관련 전체 댓글 내용 조회 핸들러
	@RequestMapping(value = { "getCommentList.do" })
	public ModelAndView comment(CommentVO vo, WebRequest request) {
		// [COMMENT DB]에 [post_id]의 댓글을 모두 조회
		List<CommentVO> commentList = commentService.getCommentList(vo);

		if (commentList != null) {
			mv.addObject("commentList", commentList); // ****FRONT: parameter 수정가능
			mv.addObject("commentStatus", "1"); // ****FRONT: parameter 수정가능
			System.out.println("댓글 조회");
			mv.setViewName("TEST-comment"); // ****FRONT: view url 수정가능
			return mv;
		} else {
			mv.addObject("commentStatus", "0"); // ****FRONT: parameter 수정가능
			System.out.println("댓글 없음");
			return mv;
		}
	}

	// post_id 에 댓글 작성 버튼 핸들러
	// 보내는 인자 (CommentVO : comment_content, comment_writer, post_id)
	@RequestMapping(value = { "insertComment.do" })
	public ModelAndView insertComment(CommentVO vo) {
		// insertComment() 댓글입력 후 return 값: 댓글 개수 증가
		int countComment = commentService.insertComment(vo);
		
		if (countComment != 0) {
			System.out.println("현재 댓글 : " + countComment);
			mv.addObject("countComment", countComment);
			mv.addObject("commentStatus", "insert1"); // ****FRONT: parameter 수정가능
			mv.setViewName("TEST-comment"); // ****FRONT: view url 수정가능
			System.out.println("댓글 작성!");
		} else {
			mv.addObject("commentStatus", "insert0"); // ****FRONT: parameter 수정가능
			mv.setViewName("index");
			System.out.println("댓글 실패!");
		}
		
		return mv;
	}

	// 댓글 상세 조회 핸들러 (작성자일때만 접근 가능)
	// 보내는 인자 (CommentVO : post_id, comment_writer)
	@RequestMapping(value = { "getComment.do" })
	public ModelAndView getComment(CommentVO vo) {
		commentService.getComment(vo);
		mv.setViewName("TEST-comment"); // ****TEAM-FRONT: view url 수정가능

		return mv;
	}

	// 댓글 삭제 핸들러
	// 보내는 인자 (CommentVO : post_id, comment_writer)
	@RequestMapping(value = { "deleteComment.do" })
	public ModelAndView deleteComment(CommentVO vo) {
		commentService.deleteComment(vo);
		mv.setViewName("TEST-comment"); // ****TEAM-FRONT: view url 수정가능

		return mv;
	}

	// 댓글에 내용 수정 핸들러
	// 보내는 인자 (CommentVO : post_id, comment_writer)
	@RequestMapping(value = { "updateComment.do" })
	public ModelAndView updateComment(CommentVO vo) {
		commentService.updateComment(vo);
		mv.setViewName("TEST-comment"); // ****TEAM-FRONT: view url 수정가능

		return mv;
	}
	
	/**************************************************************************************************
	 * [글쓰기] HANDLERS
	 *************************************************************************************************/
	
	@RequestMapping(value = { "getPostList.do" })
	public ModelAndView getPostList(PostVO vo, WebRequest request) {
		// [COMMENT DB]에 [post_id]의 댓글을 모두 조회
		List<PostVO> postList = postService.getPostList(vo);

		if (postList != null) {
			mv.addObject("postList", postList); // ****FRONT: parameter 수정가능
			System.out.println("전체 게시글 조회");
			mv.setViewName("TEST-comment"); // ****FRONT: view url 수정가능
			return mv;
		} else {
			mv.addObject("commentStatus", "0"); // ****FRONT: parameter 수정가능
			System.out.println("게시글 없음");
			return mv;
		}
	}
	
	@RequestMapping(value = { "insertPost.do" })
	public ModelAndView insertPost (PostVO vo) {
		System.out.println("insertPost() 호출");
		int countPost = postService.insertPost(vo);
		mv.addObject("countPost", countPost);	
		mv.setViewName("index");
			
		return mv;
	}
	
	@RequestMapping(value = { "deletePost.do" })
	public ModelAndView deletePost (PostVO vo) {
		System.out.println("deletePost() 호출");
		postService.deletePost(vo);
		mv.setViewName("index");		// ****TEAM-FRONT: view url 수정가능
			
		return mv;
	}
	
	@RequestMapping(value = { "updatePost.do" })
	public ModelAndView updatePost (PostVO vo) {
		System.out.println("updatePost() 호출");
		postService.updatePost(vo);
		mv.setViewName("index");		// ****TEAM-FRONT: view url 수정가능
			
		return mv;
	}

} // END OF Controller CLASS
