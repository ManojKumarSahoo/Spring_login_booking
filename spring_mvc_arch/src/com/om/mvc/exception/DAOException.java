package com.om.mvc.exception;

public class DAOException extends Exception
{
	private static final long serialVersionUID = 1L;
	private String msg;
	public DAOException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	@Override
	public String toString() {
		return "DAOException"+msg;
	}
}
