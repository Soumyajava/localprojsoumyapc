package com.san.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.san.main.model.Hotels;
import com.san.main.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	private HotelService service;
	
	//create hotel
	
	@PostMapping(value ="/createhotel")
	public ResponseEntity<Hotels> createHotel(@RequestBody  Hotels hotel) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(hotel));
		
	}
	
	
	//get all hotels
	@GetMapping("/getAllhotels")
	public ResponseEntity<List<Hotels>> getAllHotels() {
		
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllHotels());
		
	}
	
	//get hotels by id
	
	@GetMapping("/gethotelbyid/{hotelid}")
	public ResponseEntity<Hotels> createHotel(@PathVariable String hotelid) {
		
		return ResponseEntity.status(HttpStatus.OK).body(service.getByid(hotelid));
		
	}
	
	
	
	
}
