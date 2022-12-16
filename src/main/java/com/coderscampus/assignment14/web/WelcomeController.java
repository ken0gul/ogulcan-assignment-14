package com.coderscampus.assignment14.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.assignment14.dto.User;

@Controller
public class WelcomeController {

	
	@GetMapping("/welcome")
	public String getWelcomePage() {
		return "welcome";
	}
	
	@PostMapping("/welcome")
	@ResponseBody
	public User postUsername(@RequestBody User userFromJs) {
		System.out.println(userFromJs);
		User user = new User();
		user.setUsername(userFromJs.getUsername());
		user.setId(userFromJs.getId());
		return user;
	}
}
