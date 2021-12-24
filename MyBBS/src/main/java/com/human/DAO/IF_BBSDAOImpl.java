package com.human.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.VO.BBSVO;
import com.human.VO.PageVO;

@Repository
public class IF_BBSDAOImpl implements IF_BBSDAO {
	@Inject
	SqlSession sqlSession;

	private static String mapperquery = "com.human.DAO.IF_BBSDAO";

	@Override
	public void insertBBS(BBSVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(mapperquery + ".insertBBS", vo);
	}//글쓰기

	@Override
	public List<BBSVO> selectAllBBS(PageVO pagevo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mapperquery + ".selectAll",pagevo);
	}//리스트가져오기

	@Override
	public BBSVO selectBBS(int bbsindex) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperquery + ".selectOnePost", bbsindex);
	}//글자세히보기

	@Override
	public void updateBBS(BBSVO vo) throws Exception {
		sqlSession.update(mapperquery + ".updateBBS", vo);

	}//수정하기

	@Override
	public void deleteBBS(int bbsindex) throws Exception {
		sqlSession.delete(mapperquery + ".deleteBBS", bbsindex);

	}//삭제하기

	@Override
	public void viewCnt(int bbsindex) throws Exception{
		sqlSession.update(mapperquery + ".viewCnt", bbsindex);

	}//조회수가져오기

	@Override
	public int boardCnt() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperquery+".boardCnt");
	}

	@Override
	public int getbbsSeq() throws Exception {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne(mapperquery+".getSeqBBS");
	}
}
