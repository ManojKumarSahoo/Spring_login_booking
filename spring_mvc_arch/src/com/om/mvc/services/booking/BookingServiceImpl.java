package com.om.mvc.services.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.om.mvc.dao.booking.BookingDAOImpl;
import com.om.mvc.dto.booking.BookingDTO;
@Component
public class BookingServiceImpl implements BookingService
{
	@Autowired
	private BookingDAOImpl bookingDAO;
	public BookingServiceImpl() {
		System.out.println("services created");
	}
	public void book(BookingDTO dto) 
	{
		System.out.println("inside service before ");
		System.out.println("dto \t"+dto);
		if(dto!=null)
		{
			System.out.println("give to dao");
			bookingDAO.save(dto);
			return;
		}
		System.out.println("invalid data inside servive");
	}
}
