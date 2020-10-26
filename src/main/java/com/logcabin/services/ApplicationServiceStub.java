package com.logcabin.services;

import org.springframework.stereotype.Component;
import com.logcabin.dto.ApplicationDTO;

@Component
public class ApplicationServiceStub implements IApplicationService {

	
	@Override
	public ApplicationDTO fetchByName (String name) 
	{
		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setAppName(name);
		applicationDTO.setUsername("user@" + name + ".com");
		applicationDTO.setPassword(name + "123");
		applicationDTO.setNotes("Change password for " + name);
		
		return applicationDTO;
	}

	@Override
	public void save(ApplicationDTO applicationDTO) {		
	}
	
}
