package com.om.mvc.dao.login;

import com.om.mvc.dto.login.LoginDTO;

public interface LoginDAO {
	public int add(LoginDTO dto);
	public LoginDTO login(LoginDTO dto) throws NullPointerException;
}
