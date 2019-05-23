package com.cdac.hibernate.exception;

public class CustomerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5291053449826369590L;
	
	public CustomerException() {
		
	}
	
	public CustomerException(String arg0) {
		super(arg0);
	}
	public CustomerException(Throwable arg0) {
		super(arg0);
	}
	public CustomerException(String arg0,Throwable arg1) {
		super(arg0,arg1);
	}
	public CustomerException(String arg0,Throwable arg1,boolean arg2,boolean arg3) {
		
	}

}
