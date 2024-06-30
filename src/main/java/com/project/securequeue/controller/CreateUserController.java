package com.project.securequeue.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.securequeue.service.CreateUserService;
import com.project.securequeue.service.dto.CreateUserDto;

@RestController
@RequestMapping("create")
public class CreateUserController {

	private static final Logger logger = LoggerFactory.getLogger(CreateUserController.class);

	private final CreateUserService createUserService;

	public CreateUserController(CreateUserService createUserService) {
		this.createUserService = createUserService;
	}

	@PostMapping
	public ResponseEntity<Void> create(@RequestBody CreateUserRequest createUserRequest) {
		logger.info("Starting create user process for user: {}", createUserRequest.username);

		CreateUserDto createUserDto = new CreateUserDto(createUserRequest.username, createUserRequest.password);

		createUserService.create(createUserDto);

		logger.info("User successfully create: {}", createUserRequest.username);

		return ResponseEntity.created(URI.create("")).build();
	}

	public record CreateUserRequest(String username, String password) {
	}
}
