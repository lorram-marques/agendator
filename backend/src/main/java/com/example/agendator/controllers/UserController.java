package com.example.agendator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public String getMessage() {
		return "Route answer displayed";
	}
	
}
