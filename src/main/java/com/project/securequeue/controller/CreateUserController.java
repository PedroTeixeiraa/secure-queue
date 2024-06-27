package com.project.securequeue.controller;

import java.net.URI;

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

	private CreateUserService createUserService;

	public CreateUserController(CreateUserService createUserService) {
		this.createUserService = createUserService;
	}

	@PostMapping
	public ResponseEntity<Void> create(@RequestBody CreateUserRequest createUserRequest) {
		CreateUserDto createUserDto = new CreateUserDto(createUserRequest.username, createUserRequest.password);

		createUserService.create(createUserDto);

		return ResponseEntity.created(URI.create("")).build();
	}

	public record CreateUserRequest(String username, String password) {
	}
}
