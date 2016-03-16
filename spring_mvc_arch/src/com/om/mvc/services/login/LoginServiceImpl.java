package com.om.mvc.services.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.om.mvc.dao.login.LoginDAOImpl;
import com.om.mvc.dto.login.LoginDTO;
import com.om.mvc.exception.DAOException;
import com.om.mvc.exception.ServiceException;

@Component
public class LoginServiceImpl implements LoginSrvice
{
	@Autowired
	private LoginDAOImpl loginDAO;
			//private LoginService service;
	public LoginServiceImpl() 
	{
		System.out.println("login service created");
	}
	@Override
	public LoginDTO login(LoginDTO dto) throws ServiceException, DAOException
	{
		System.out.println("inside login service");
		
		return loginDAO.login(dto);
	}
	@Override
	public int add(LoginDTO dto) throws ServiceException, DAOException
	{
		return loginDAO.add(dto);
	}
}
