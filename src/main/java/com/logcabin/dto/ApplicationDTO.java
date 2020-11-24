package com.logcabin.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application")
public class ApplicationDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "application_id")
	private String applicationId;
	
	@Column(name = "user_name")
	private String username;
	
	@Column(name = "pass_word")
	private String password;
	
	@Column(name = "new_notes")
	private String notes;
	
	
public ApplicationDTO() {
		
	}

	public ApplicationDTO(String applicationId, String username, String password, String notes) {
		this.applicationId = applicationId;
		this.username = username;
		this.password = password;
		this.notes = notes;
	}
	
	
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String appName) {
		this.applicationId = appName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return applicationId + " " + username + " " + password + " "  + notes;
	}

}
