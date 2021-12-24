package com.human.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.DAO.IF_MemberDAO;
import com.human.VO.MemberVO;

@Service
public class IF_MemberServiceImpl implements IF_MemberService {
	@Inject
	private IF_MemberDAO memberDAO; // DAO인젝션

	@Override
	public void addMember(MemberVO vo) throws Exception {
		memberDAO.Insertmember(vo);
	}

	@Override
	public List<MemberVO> getMemberList() throws Exception {
		return memberDAO.getMemberList();
	}

	@Override
	public MemberVO getMemberInfo(int no) throws Exception {
		return memberDAO.selectmember(no);
	}

	@Override
	public void modMember(MemberVO vo) throws Exception {
		memberDAO.updateMember(vo);
	}

	@Override
	public void delMember(int no) throws Exception {
		memberDAO.deleteMember(no);
		
	}

	@Override
	public MemberVO loginCheck(String id) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.selectId(id);
	}

}
