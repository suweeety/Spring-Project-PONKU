package org.zerock.service;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.MemberVO;

public interface LoginService {
//서비스 인터페이스
	
	public boolean isMember(String userid); //회원인지 확인하는 메서드 
	
	public MemberVO findId (String email ,String name); //이름과 이메일로 아이디를 찾는 메서드 
	
	public MemberVO findPw (String email ,String id); // id와 이메일로 패스워드를 찾는 메서드 
}
