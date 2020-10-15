package com.logcabin.services;

import com.logcabin.dto.ApplicationDTO;

public interface IApplicationService {

	ApplicationDTO fetchByName(String name);

	void save(ApplicationDTO applicationDTO);

}