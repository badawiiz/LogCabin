package com.logcabin.services;

import java.util.List;

import com.logcabin.dto.ApplicationDTO;

public interface IApplicationService {
	
	public List<ApplicationDTO> findAll();

	public ApplicationDTO fetchByName(String name);

	public void save(ApplicationDTO applicationDTO);

}