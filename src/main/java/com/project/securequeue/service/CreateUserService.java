package com.project.securequeue.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.securequeue.model.User;
import com.project.securequeue.repository.UserRepository;
import com.project.securequeue.service.dto.CreateUserDto;

@Service
public class CreateUserService {

	private final UserRepository repository;
	private final PasswordEncoder passwordEncoder;

	public CreateUserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.repository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public void create(CreateUserDto createUserDto) {
		var encodedPassword = passwordEncoder.encode(createUserDto.getPassword());

		var user = new User(createUserDto.getUsername(), encodedPassword);

		repository.save(user);
	}


}
