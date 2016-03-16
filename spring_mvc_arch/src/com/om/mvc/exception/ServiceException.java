package com.om.mvc.exception;

public class ServiceException extends Exception
{

	private static final long serialVersionUID = 1L;
	private String msg;
	public ServiceException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	@Override
	public String toString() {
		return "ServiceException"+msg;
	}
}
