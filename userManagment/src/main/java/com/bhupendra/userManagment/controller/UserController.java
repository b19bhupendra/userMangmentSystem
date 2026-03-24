package com.bhupendra.userManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhupendra.userManagment.dto.UserDto;
import com.bhupendra.userManagment.entity.User;
import com.bhupendra.userManagment.repository.UserRepository;
import com.bhupendra.userManagment.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private final UserService userService; // interface 
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/create-user")
	public UserDto addUser(@RequestBody UserDto userDto) {
		return userService.createUser(userDto);
	}
	
	@GetMapping("/get-all-user")
	public List<User> getAllUser(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/get-user/{id}")
	public UserDto getUserById(@PathVariable String id) {
		return userService.getUserById(id);
	}

}
