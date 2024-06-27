package com.project.securequeue.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.securequeue.security.AuthenticationService;

@RestController
@RequestMapping("authenticate")
public class AuthenticationController {

	private final AuthenticationService authenticationService;

	public AuthenticationController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	@PostMapping
	public String authenticate(Authentication authentication) {
		return authenticationService.authenticate(authentication);
	}
}