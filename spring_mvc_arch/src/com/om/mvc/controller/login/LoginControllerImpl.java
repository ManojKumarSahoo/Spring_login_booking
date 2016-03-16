package com.om.mvc.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.om.mvc.dto.login.LoginDTO;
import com.om.mvc.exception.ControllerException;
import com.om.mvc.exception.DAOException;
import com.om.mvc.exception.ServiceException;
import com.om.mvc.services.login.LoginServiceImpl;

@Component
@RequestMapping("/")
public class LoginControllerImpl implements LoginController
{
	@Autowired
	private LoginServiceImpl loginservice;
	
	public LoginControllerImpl() {
		System.out.println("login created..");
	}
	@RequestMapping(value="/login")
	public String login(LoginDTO dto) throws ControllerException, ServiceException, DAOException
	{
		try
		{
		LoginDTO dto2=loginservice.login(dto);
		System.out.println("login page ...");
		//System.out.println(dto2.getUser()+"logged");
					//loginservice.login(dto);
		return "/LoginSuccess.jsp";
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("user not found");
			return "/login.jsp";
		}
	}
	@RequestMapping("/new")
	public String add(@ModelAttribute LoginDTO dto) throws ServiceException,ControllerException, DAOException
	{
		int id=loginservice.add(dto);
		if(id!=0){
			System.out.println("added..");
		}
		return "/login.jsp";
	}
}
