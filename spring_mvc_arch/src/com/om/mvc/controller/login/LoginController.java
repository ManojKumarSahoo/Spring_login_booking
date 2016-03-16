package com.om.mvc.controller.login;

import com.om.mvc.dto.login.LoginDTO;
import com.om.mvc.exception.ControllerException;
import com.om.mvc.exception.DAOException;
import com.om.mvc.exception.ServiceException;

public interface LoginController {
	String login(LoginDTO dto) throws ControllerException, ServiceException, DAOException;
	String add(LoginDTO dto) throws ServiceException, ControllerException, DAOException;
}
