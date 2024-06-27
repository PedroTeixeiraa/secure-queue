package com.project.securequeue.service.dto;

public class CreateUserDto {

	private String username;
	private String password;

	public CreateUserDto(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
