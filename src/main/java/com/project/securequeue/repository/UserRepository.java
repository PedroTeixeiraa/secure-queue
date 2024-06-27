package com.project.securequeue.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.securequeue.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findByUsername(String username);
}
