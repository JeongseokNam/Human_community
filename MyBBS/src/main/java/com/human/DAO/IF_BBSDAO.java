package com.human.DAO;

import java.util.List;

import com.human.VO.BBSVO;
import com.human.VO.PageVO;

public interface IF_BBSDAO {

	void insertBBS(BBSVO vo) throws Exception;

	List<BBSVO> selectAllBBS(PageVO pagevo) throws Exception;

	BBSVO selectBBS(int bbsindex) throws Exception;

	void updateBBS(BBSVO vo) throws Exception;

	void deleteBBS(int bbsindex) throws Exception;

	void viewCnt(int bbsindex) throws Exception;

	int boardCnt()throws Exception;
	
	int getbbsSeq() throws Exception;
}
