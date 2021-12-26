package com.human.mybbs;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.VO.BBSVO;
import com.human.VO.PageVO;
import com.human.service.IF_BBSService;
import com.human.service.IF_CommentService;
import com.human.util.FileDataUtil;

@Controller
public class BBSController {
	@Inject
	IF_BBSService bbsService;
	@Inject
	IF_CommentService commentService;
	@Inject FileDataUtil fileDataUtil;

	@RequestMapping(value = "/BBSMain", method = RequestMethod.GET)
	public String BBSMain(Locale locale, Model model,@ModelAttribute PageVO pagevo) throws Exception {
		if (pagevo.getPage() == null) {
			pagevo.setPage(1);
		}
		pagevo.setPerPageNum(10);
		pagevo.setTotalCount(bbsService.boardcnt());
		model.addAttribute("bbsList", bbsService.getBBSList(pagevo));
		return "bbs/BBSMain";
	}

	@RequestMapping(value = "/addPostForm", method = RequestMethod.GET)
	public String addPostForm(Locale locale) throws Exception {
		return "bbs/addPostForm";
	}

	@RequestMapping(value = "/addPost", method = RequestMethod.POST)
	public String addPost(Locale locale, BBSVO vo) throws Exception {
			bbsService.addPost(vo);
		return "redirect:/BBSMain";
	}

	@RequestMapping(value = "/BBSView", method = RequestMethod.GET)
	public String BBSView(Locale locale, int bbsindex, Model model) throws Exception {
		model.addAttribute("bbsdata", bbsService.viewPost(bbsindex));
		model.addAttribute("commentList", commentService.getCommentList(bbsindex));
		return "bbs/BBSView";
	}

	@RequestMapping(value = "/modPost", method = RequestMethod.POST)
	public String modPost(Locale locale, BBSVO vo, String name, RedirectAttributes redirect) throws Exception {
		bbsService.modPost(vo);
		redirect.addAttribute("name", name);
		return "redirect:/BBSMain";
	}

	@RequestMapping(value = "/delPost", method = RequestMethod.GET)
	public String delBBS(Locale locale, int bbsindex) throws Exception {
		bbsService.delPost(bbsindex);
		return "redirect:/BBSMain";
	}
}
