package com.om.mvc.services.login;

import com.om.mvc.dto.login.LoginDTO;
import com.om.mvc.exception.DAOException;
import com.om.mvc.exception.ServiceException;

public interface LoginSrvice {
	public LoginDTO login(LoginDTO dto) throws ServiceException, DAOException;
	public int add(LoginDTO dto) throws ServiceException, DAOException;
}
