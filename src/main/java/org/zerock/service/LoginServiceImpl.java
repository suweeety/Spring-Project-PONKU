package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.LoginMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service //서비스 계층
public class LoginServiceImpl implements LoginService {

	@Setter(onMethod_ = @Autowired )
	private LoginMapper loginMapper ;
	
	@Override
	public boolean isMember(String userid) {
	//멤버이면 true 반환
		return loginMapper.read(userid) == null ? false : true;
	}

	@Override
	public MemberVO findId(String email , String name) {
		// 이름과 이메일로 정보를 찾는다
		return loginMapper.getIdByNameAndEmail(email ,name);
	}

	@Override
	public MemberVO findPw(String email, String id) {
		// 아이디와 이메일로 정보를 찾는다
		return loginMapper.getPwByIdAndEmail(email, id);
	}

}
