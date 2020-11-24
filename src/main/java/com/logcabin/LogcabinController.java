package com.logcabin;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.logcabin.dto.ApplicationDTO;
import com.logcabin.services.IApplicationService;



@Controller
public class LogcabinController {
	
	public IApplicationService applicationService;
	
	public LogcabinController (IApplicationService theApplicationService) {
		
		applicationService = theApplicationService;
	}
	
	//ApplicationServiceStub  applicationServiceStub;
	
	@RequestMapping(value="websites/home", params= {"application=facebook"})
	public String facebook(Model model){
		
				//Retrieve App information from the Database
		ApplicationDTO applicationDTO = applicationService.fetchByName("Facebook");
		model.addAttribute("applicationDTO", applicationDTO);
		return "application";

	}
	
	@RequestMapping(value="websites/home", params= {"application=instagram"})
	public String instagram(Model model){
		
		ApplicationDTO applicationDTO = applicationService.fetchByName("Instagram");
		model.addAttribute("applicationDTO", applicationDTO);
		return "application";

	}
	
	@RequestMapping(value="websites/home", params= {"application=twitter"})
	public String twitter(Model model){
		
		ApplicationDTO applicationDTO = applicationService.fetchByName("Twitter");
		model.addAttribute("applicationDTO", applicationDTO);
		return "application";

	}
	
	@RequestMapping(value="/home")
	public String home(){
		
		return "home";

	}
	
	@RequestMapping("/")
	public String Index(){
		
		return "home";
	}
	
	@PostMapping("/save")
	public String saveApplication(@ModelAttribute("application") ApplicationDTO theApplication) {
	
		//Register the Faculty
		applicationService.save(theApplication);
		
		//Block duplicate submission for accidental page refreshed
		return "redirect:/";
	
	}
}
