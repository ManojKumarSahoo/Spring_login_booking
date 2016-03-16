package com.om.mvc.dto.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="logindata_tab")
public class LoginDTO 
{
	@Id
	@GenericGenerator(name="ic",strategy="increment")
	@GeneratedValue(generator="ic")
	@Column
	private int id;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column
	private String user;
	@Column
	private String email;
	@Column
	private String pw;

	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
