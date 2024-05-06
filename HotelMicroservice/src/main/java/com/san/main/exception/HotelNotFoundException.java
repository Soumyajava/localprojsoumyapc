package com.san.main.exception;

public class HotelNotFoundException extends RuntimeException {
	
	//private String message;
	
	public HotelNotFoundException() {
		super("Hotel not found.");
	}
	
	public HotelNotFoundException(String msg) {
		super(msg);
	}
	
	

}
