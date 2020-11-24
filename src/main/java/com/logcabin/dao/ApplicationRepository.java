package com.logcabin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logcabin.dto.ApplicationDTO;

public interface ApplicationRepository extends JpaRepository<ApplicationDTO, String> {
	
	//Method to find all Applications
	
	public List<ApplicationDTO>findAll();

}
