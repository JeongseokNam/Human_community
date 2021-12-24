package com.human.DAO;

import java.util.List;

import com.human.VO.MemberVO;
public interface IF_MemberDAO {
	public void Insertmember(MemberVO vo) throws Exception;

	public List<MemberVO> getMemberList() throws Exception;

	public MemberVO selectmember(int no) throws Exception;

	public void updateMember(MemberVO vo) throws Exception;

	public void deleteMember(int no)throws Exception;

	public MemberVO selectId(String id) throws Exception;
}
