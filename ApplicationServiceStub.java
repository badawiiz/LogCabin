package com.logcabin.services;

import org.springframework.stereotype.Component;

import com.logcabin.dto.ApplicationDTO;



@Component
public class ApplicationServiceStub implements IApplicationService {

	//I did not know that you can set multiple parameters using one function
	//This will save and and energy down the road
	
	@Override
	public ApplicationDTO fetchByName (String name) 
	{
		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setApplicationId(name);
		applicationDTO.setUsername("user@" + name + ".com");
		applicationDTO.setPassword(name + "123");
		applicationDTO.setNotes("Change password for " + name);
		
		return applicationDTO;
	}

	@Override
	public void save(ApplicationDTO applicationDTO) {
		
		
	}
	
}
