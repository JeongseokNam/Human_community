package com.human.service;

import java.util.List;

import com.human.VO.CommentVO;

public interface IF_CommentService {

	void addComent(CommentVO vo, String name)throws Exception;

	List<CommentVO> getCommentList(int bbsno)throws Exception;

}
