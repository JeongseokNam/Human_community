package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_BBSDAO;
import com.human.VO.BBSVO;
import com.human.VO.PageVO;

@Service
public class IF_BBSServiceImpl implements IF_BBSService {
	@Inject
	IF_BBSDAO bbsDAO;

	@Override
	public void addPost(BBSVO vo) throws Exception{
		int nowNo=bbsDAO.getbbsSeq();
		vo.setNo(nowNo);
		bbsDAO.insertBBS(vo);
	}//글쓰기

	@Override
	public List<BBSVO> getBBSList(PageVO pagevo) throws Exception{
		// TODO Auto-generated method stub
		return bbsDAO.selectAllBBS(pagevo);
	}//목록가져오기

	@Override
	public BBSVO viewPost(int bbsindex) throws Exception{
		bbsDAO.viewCnt(bbsindex);
		return bbsDAO.selectBBS(bbsindex);
	}//조회수,글보기

	@Override
	public void modPost(BBSVO vo) throws Exception{
		bbsDAO.updateBBS(vo);
	}//수정하기

	@Override
	public void delPost(int bbsindex) throws Exception{
		bbsDAO.deleteBBS(bbsindex);
		
	}//삭제하기

	@Override
	public int boardcnt() throws Exception {
		// TODO Auto-generated method stub
		return bbsDAO.boardCnt();
	}
}
