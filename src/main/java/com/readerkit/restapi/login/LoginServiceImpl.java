package com.readerkit.restapi.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public int userReg(Login login) {
		return loginMapper.userReg(login);
	}
	
	@Override
	public int searchUser(Login login) {
		return loginMapper.searchUser(login);
	}
	
}
