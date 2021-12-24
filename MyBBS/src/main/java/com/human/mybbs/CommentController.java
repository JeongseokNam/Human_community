package com.human.mybbs;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.VO.CommentVO;
import com.human.service.IF_CommentService;

@Controller
public class CommentController {
	@Inject
	private IF_CommentService commentService;

	@RequestMapping(value = "/addComent", method = RequestMethod.POST)
	public String addComent(Locale locale, CommentVO vo) throws Exception {
		return "redirect:/BBSView?bbsindex="+vo.getComno();
	}
}