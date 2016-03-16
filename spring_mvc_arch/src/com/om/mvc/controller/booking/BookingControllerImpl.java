package com.om.mvc.controller.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.om.mvc.dto.booking.BookingDTO;
import com.om.mvc.services.booking.BookingServiceImpl;

@Component
@RequestMapping("/")
public class BookingControllerImpl implements BookingController
{
	@Autowired
	private BookingServiceImpl bookingService;
	
	public BookingControllerImpl() 
	{
		System.out.println("Controller created");
	}
	@RequestMapping(value="/ticket")
	public String book(@ModelAttribute BookingDTO dto) 
	{
		System.out.println("inside book method");
		System.out.println(dto.getFrom());
		bookingService.book(dto);
		return "/ThankU.jsp";
	}
}
