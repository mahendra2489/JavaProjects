package com.org.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.demo.demo.Model.User;

@RestController
public class UserController {
	
	@RequestMapping("hello")
	public String sayHello() {
		return "Hello You are in Spring Boot";
	}
	
	@RequestMapping("users")
	public List<User> getAllUsers() {
		
		return Arrays.asList(new User("mahendra","Mahendra Dewangan","9981776186"),
							new User("kishormo","Kishor Mohanty","1234567890"),
							new User("kishormi","Kishor Mistry","9876543210")
							);
		
	}
	

	
	

}
