package com.logcabin.services;

import org.springframework.stereotype.Component;

import com.logcabin.dto.ApplicationDTO;



@Component
public class ApplicationServiceStub {

	
	public ApplicationDTO fetchByName (String name) 
	{
		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setAppName("Facebook");
		applicationDTO.setUsername("user@facebook.com");
		applicationDTO.setPassword("Facebook123");
		applicationDTO.setNotes("Chnage password!");
		
		return applicationDTO;
	}

	public void save(ApplicationDTO applicationDTO) {
		
		
	}
	
}
