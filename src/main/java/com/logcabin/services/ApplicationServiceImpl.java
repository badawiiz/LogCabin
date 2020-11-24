package com.logcabin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logcabin.dao.ApplicationRepository;
import com.logcabin.dto.ApplicationDTO;



@Component
public class ApplicationServiceImpl implements IApplicationService {

	public ApplicationRepository applicationRepository;
	
	@Autowired
	public ApplicationServiceImpl (ApplicationRepository theApplicationRepository) {
		
		applicationRepository = theApplicationRepository;
	}
	
	@Override
	public ApplicationDTO fetchByName (String applicationId) 
	{
		Optional<ApplicationDTO> applicationid = applicationRepository.findById(applicationId);
		
		ApplicationDTO theApplication = null;
		
		if(applicationid.isPresent()) {
			
			theApplication = applicationid.get();
			
		}
		
else {
			
			//faculty id not found
			
			throw new RuntimeException ("Cannot find your info for - " + applicationId);
		}
		
		return theApplication;
	}
	
	

	@Override
	public void save(ApplicationDTO applicationDTO) {
		
		applicationRepository.save(applicationDTO);
	}

	@Override
	public List<ApplicationDTO> findAll() {
		// TODO Auto-generated method stub
		return applicationRepository.findAll();
	}
	
}
