package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_CommentDAO;
import com.human.VO.CommentVO;

@Service
public class IF_CommentServiceImpl implements IF_CommentService{
@Inject
private IF_CommentDAO commentDAO;
	@Override
	public void addComent(CommentVO vo, String name) throws Exception {
		vo.setCommenter(name);
		commentDAO.insertComment(vo);
	}//댓글달기
	@Override
	public List<CommentVO> getCommentList(int bbsno) throws Exception {
		// TODO Auto-generated method stub
		return commentDAO.selectCommentList(bbsno);
	}//댓글가져오기

}
