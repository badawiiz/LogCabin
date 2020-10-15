package com.logcabin.dto;

public class ApplicationDTO {
	
	private String appName;
	private String username;
	private String password;
	private String notes;
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
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
		return appName + " " + username + " " + password + " "  + notes;
	}

}
