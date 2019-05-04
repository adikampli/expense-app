package com.adi.expenseauth.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adi.expenseauth.entity.User;
import com.adi.expenseauth.entity.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository repo;

	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@GetMapping(path = "/current")
	public Principal getUser(Principal principal) {
		return principal;
	}

	@PostMapping(path = "/user")
	public void createUser(@RequestBody User user) {
		repo.findById(user.getUsername()).ifPresent(ex -> {
			throw new IllegalArgumentException("User already exits");
		});
		
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		repo.save(user);
	}
}
