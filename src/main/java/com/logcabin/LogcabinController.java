package com.logcabin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logcabin.dto.ApplicationDTO;
import com.logcabin.services.IApplicationService;


@Controller
public class LogcabinController {
	
	@Autowired
	private IApplicationService applicationServiceStub;
	
	@RequestMapping(value="/home", params= {"application=facebook"})
	public String facebook(Model model){
		
		ApplicationDTO applicationDTO = applicationServiceStub.fetchByName("Facebook");
		model.addAttribute("applicationDTO", applicationDTO);
		return "application";

	}
	
	@RequestMapping(value="/home", params= {"application=instagram"})
	public String instagram(Model model){
		
		ApplicationDTO applicationDTO = applicationServiceStub.fetchByName("Instagram");
		model.addAttribute("applicationDTO", applicationDTO);
		return "application";

	}
	
	@RequestMapping(value="/home", params= {"application=twitter"})
	public String twitter(Model model){
		
		ApplicationDTO applicationDTO = applicationServiceStub.fetchByName("Twitter");
		model.addAttribute("applicationDTO", applicationDTO);
		return "application";

	}
	
	@RequestMapping(value="/home")
	public String home(){
		
		return "home";

	}
}
