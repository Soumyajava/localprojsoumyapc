package com.san.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.main.exception.HotelNotFoundException;
import com.san.main.model.Hotels;
import com.san.main.repo.Hotelrepo;

@Service
public class Hotelserviceimpl implements HotelService {
	
	@Autowired
	private Hotelrepo repo;

	@Override
	public Hotels create(Hotels hotel) {
		// TODO Auto-generated method stub
		return repo.save(hotel);
	}

	@Override
	public List<Hotels> getAllHotels() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Hotels getByid(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new HotelNotFoundException("Hotel not found in this id:"+id));
	}

	
	
	
	

}
