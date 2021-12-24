package com.human.service;

import java.util.List;

import com.human.VO.MemberVO;

public interface IF_MemberService {
	public void addMember(MemberVO vo) throws Exception;

	public List<MemberVO> getMemberList() throws Exception;

	public MemberVO getMemberInfo(int no) throws Exception;

	public void modMember(MemberVO vo)throws Exception;

	public void delMember(int no)throws Exception;

	public MemberVO loginCheck(String id)throws Exception;
}
