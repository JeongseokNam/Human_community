package com.human.service;

import java.util.List;

import com.human.VO.BBSVO;
import com.human.VO.PageVO;

public interface IF_BBSService {

	void addPost(BBSVO vo) throws Exception;

	public List<BBSVO> getBBSList(PageVO pagevo) throws Exception;

	BBSVO viewPost(int bbsindex) throws Exception;

	void modPost(BBSVO vo) throws Exception;

	void delPost(int bbsindex) throws Exception;

	int boardcnt() throws Exception;
}
