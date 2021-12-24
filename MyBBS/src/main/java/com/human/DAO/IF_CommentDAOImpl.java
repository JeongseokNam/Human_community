package com.human.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.VO.CommentVO;

@Repository
public class IF_CommentDAOImpl implements IF_CommentDAO{
@Inject
private SqlSession sqlSession;
private static String mapperquery="com.human.DAO.IF_CommentDAO";
@Override
public void insertComment(CommentVO vo) throws Exception{
 sqlSession.insert(mapperquery+".insetComment",vo); 
	//댓글추가
}
@Override
public List<CommentVO> selectCommentList(int bbsno) throws Exception {
	// TODO Auto-generated method stub
	return sqlSession.selectList(mapperquery+".selectAllComment",bbsno);
}//댓글가져오기

}
