package com.om.mvc.dto.booking;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="booking_tab")
public class BookingDTO 
{
	@Id
	@GenericGenerator(name="ic",strategy="increment")
	@GeneratedValue(generator="ic")
	@Column
	private int id;
	
	@Column(name="b_from")
	private String from;
	
	@Column(name="b_to")
	private String to;
	
	@Column(name="b_classType")
	private String classType;
	
	@Column(name="b_date")
	private Date date;
	
	@Column(name="b_seats")
	private int seats;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}
