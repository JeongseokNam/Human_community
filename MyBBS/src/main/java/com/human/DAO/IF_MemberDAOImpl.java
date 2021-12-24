package com.human.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.VO.MemberVO;
@Repository
public class IF_MemberDAOImpl implements IF_MemberDAO{
	@Inject 
	private SqlSession sqlSession;
	private static String mapperquery="com.human.DAO.IF_MemberDAO";
	@Override
	public void Insertmember(MemberVO vo) throws Exception{
		sqlSession.insert(mapperquery+".memberinsert",vo);
		
	}
	@Override
	public List<MemberVO> getMemberList() throws Exception{
		
		return sqlSession.selectList(mapperquery+".selectAllMember");
	}
	
	@Override
	public MemberVO selectmember(int no) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperquery+".selectOneNO",no);
	}
	@Override
	public void updateMember(MemberVO vo) throws Exception {
		sqlSession.update(mapperquery+".updateMember",vo);
		
	}
	@Override
	public void deleteMember(int no) throws Exception {
		sqlSession.delete(mapperquery+".deleteMember",no);
	}
	@Override
	public MemberVO selectId(String id) throws Exception{
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mapperquery+".selectID",id);
	}
	
}
