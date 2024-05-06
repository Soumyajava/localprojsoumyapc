package com.san.main.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.san.main.model.ErrorMessage;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(HotelNotFoundException.class)
	public ResponseEntity<Map<String, Object>> getError(HotelNotFoundException e){
		//ErrorMessage message=new ErrorMessage();
		//message.setCode("400");
		//message.setMsg(e.getMessage());
		//return new ResponseEntity<ErrorMessage>(message,HttpStatus.BAD_REQUEST);
		
		Map<String,Object> map=new HashMap<>();
		map.put("message", e.getMessage());
		map.put("success", false);
		map.put("status", HttpStatus.NOT_FOUND);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		
	}

}
