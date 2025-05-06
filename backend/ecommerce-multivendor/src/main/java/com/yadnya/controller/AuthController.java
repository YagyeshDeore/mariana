package com.yadnya.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yadnya.model.User;
import com.yadnya.response.SignUpRequest;


@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@PostMapping("/signup")
	public ResponseEntity<User> createUserHandler(@RequestBody SignUpRequest req){
	
		User user = new User();
		user.setEmail(req.getEmail());
		user.setFullname(req.getFullName());
			
		return ResponseEntity.ok(user);
	}
	
}
