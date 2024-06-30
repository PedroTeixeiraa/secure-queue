package com.project.securequeue.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.securequeue.security.AuthenticationService;

@RestController
@RequestMapping("authenticate")
public class AuthenticationController {

	private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

	private final AuthenticationService authenticationService;

	public AuthenticationController(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	@PostMapping
	public String authenticate(Authentication authentication) {
		logger.info("Starting login process for user: {}", authentication.getName());

		String result = authenticationService.authenticate(authentication);

		logger.info("User successfully authenticated: {}", authentication.getName());

		return result;
	}
}
