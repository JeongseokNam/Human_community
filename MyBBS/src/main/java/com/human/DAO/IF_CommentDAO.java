package com.human.DAO;

import java.util.List;

import com.human.VO.CommentVO;

public interface IF_CommentDAO {

	void insertComment(CommentVO vo) throws Exception;

	List<CommentVO> selectCommentList(int bbsno) throws Exception;

}
