package com.san.main.service;

import java.util.List;

import com.san.main.model.Hotels;

public interface HotelService {
	
	//create hotels
	Hotels create(Hotels hotel);
	
		//get all hotels
	
	List<Hotels> getAllHotels();
	
	//get hotel by id
	Hotels getByid(String id);
	

}
