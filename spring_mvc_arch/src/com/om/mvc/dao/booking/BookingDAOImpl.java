package com.om.mvc.dao.booking;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.om.mvc.dto.booking.BookingDTO;
@Component
public class BookingDAOImpl implements BookingDAO
{
	@Autowired
	private SessionFactory factory;
	
	public BookingDAOImpl() {
		System.out.println("dao created");
	}
	public void save(BookingDTO dto)
	{
		System.out.println("inside save");
		/*Configuration cfg=new Configuration();
		cfg.configure();
		factory=cfg.buildSessionFactory();*/
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try
		{
			session.save(dto);
			tx.commit();
		}
		catch(HibernateException he){
			he.printStackTrace();
			tx.rollback();
		}
		finally
		{
			session.close();
		}
	}
}
