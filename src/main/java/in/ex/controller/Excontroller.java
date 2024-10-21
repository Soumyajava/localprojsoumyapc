package in.ex.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Excontroller {

	
	
	
@GetMapping("/getmsg")
	public String getMessage() {
		
		//get the current time and date
		
	 LocalDateTime now = LocalDateTime.now();
	 
	 System.out.println(now.toString());
		
		return now.toString()+"this project built by jenkins.";
	}
	
	
}
