package com.om.mvc.dao.login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.om.mvc.dto.login.LoginDTO;
import com.om.mvc.exception.DAOException;

@Component
public class LoginDAOImpl {
	
	@Autowired
	private SessionFactory factory;
	
	public LoginDAOImpl() {
	System.out.println("login dao created");
	}

	public int add(LoginDTO dto) throws DAOException
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		return dto.getId();
	}

	public LoginDTO login(LoginDTO dto) throws DAOException
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Query qry=session.createQuery("from LoginDTO where user=:user and pw=:password");
		qry.setString("user",dto.getUser());
		qry.setString("password",dto.getPw());
		LoginDTO dto2=(LoginDTO) qry.uniqueResult();
		tx.commit();
		session.close();
		return dto2;
	}
}
