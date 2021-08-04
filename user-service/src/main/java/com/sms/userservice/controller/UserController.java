package com.sms.userservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PreAuthorize("hasAnyRole('ADMIN','USER')")
	@GetMapping("/")
	public String any() {
		return "Hello, User/admin.";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String admin() {
		return "Hello, Admin.";
	}
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String user() {
		return "Hello, User.";
	}
}
