package com.sg.leo.domain;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/blog")
	public User httpGet() {
		User finduser = User.builder.id(1).username
		return finduser;
		
	}
}
