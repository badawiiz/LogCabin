package com.logcabin.services;

import com.logcabin.dto.ApplicationDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
public interface IApplicationService {

	ApplicationDTO fetchByName(String name);

	void save(ApplicationDTO applicationDTO);

}
