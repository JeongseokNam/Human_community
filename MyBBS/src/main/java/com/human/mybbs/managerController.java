package com.human.mybbs;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.VO.MemberVO;
import com.human.service.IF_MemberService;

@Controller
public class managerController {
@Inject
IF_MemberService memberService;
	
	@RequestMapping(value = "/managerMain", method = RequestMethod.GET)
	public String inputForm(Locale locale) throws Exception{

		return "manager/managerMain";
	}
	@RequestMapping(value = "/memberManager", method = RequestMethod.GET)
	public String inputForm(Locale locale,Model model) throws Exception{
		model.addAttribute("memberList", memberService.getMemberList());
		return "manager/memberManager";
	}
	@RequestMapping(value = "/modMemberForm", method = RequestMethod.GET)
	public String modMemberForm(Locale locale,int no,Model model) throws Exception{
		model.addAttribute("memberInfo", memberService.getMemberInfo(no));
		
		return "manager/modMemberForm";
	}
	@RequestMapping(value = "/modMember", method = RequestMethod.POST)
	public String modMember(Locale locale, MemberVO vo) throws Exception{
		memberService.modMember(vo);
		return "redirect:/memberManager";
	}
	@RequestMapping(value = "/delMember", method = RequestMethod.GET)
	public String delMember(Locale locale, int no) throws Exception{
		memberService.delMember(no);
		return "redirect:/memberManager";
	}
}
