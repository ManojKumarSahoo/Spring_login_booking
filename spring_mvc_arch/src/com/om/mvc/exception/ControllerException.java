package com.om.mvc.exception;

public class ControllerException extends Exception
{
	private static final long serialVersionUID = 1L;
	private String msg;
	public ControllerException(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	@Override
	public String toString() {
		return "ControllerException"+msg;
	}

}
