package com.logcabin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogcabinController {
	

	@RequestMapping(value="/home")
	public String home(){
		
		return "home";

	}
	
	@RequestMapping(value="/")
	public String index(){
		
		return "home";

	}
}
