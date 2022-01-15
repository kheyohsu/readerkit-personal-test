package com.readerkit.restapi.login;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

	public int userReg(Login login);
	
	public int searchUser(Login login);
}
