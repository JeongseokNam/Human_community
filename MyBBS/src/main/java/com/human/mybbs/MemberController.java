package com.human.mybbs;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.VO.MemberVO;
import com.human.service.IF_MemberService;

@Controller
public class MemberController {
	@Inject
	private IF_MemberService memberService; // 서비스 인젝션

	@RequestMapping(value = "/SignUpForm", method = RequestMethod.GET)
	public String inputForm(Locale locale) throws Exception{

		return "SignUpForm";
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUp(Locale local, MemberVO vo) throws Exception {
		memberService.addMember(vo);//회원가입
		return "redirect:/";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Locale locale, MemberVO vo, Model model,HttpServletRequest request) throws Exception{
		String tagetUrl = "";
		
		MemberVO tempvo = memberService.loginCheck(vo.getId());
		if (tempvo==null) {
			tagetUrl="/";
		}else {
			if (tempvo.getPwd().equals(vo.getPwd())) {
				HttpSession session = request.getSession();
				session.setAttribute("name", tempvo.getName());
				session.setAttribute("id", tempvo.getId());
				tagetUrl="BBSMain";
			}else {
				tagetUrl="/";
			}
		}
		return "redirect:"+tagetUrl;
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Locale local, MemberVO vo,HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		session.invalidate(); //세션지우기
		return "redirect:/";
	}
	
}
