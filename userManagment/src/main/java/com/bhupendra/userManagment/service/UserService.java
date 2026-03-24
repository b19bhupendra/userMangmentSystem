package com.bhupendra.userManagment.service;

import java.util.List;

import com.bhupendra.userManagment.dto.UserDto;
import com.bhupendra.userManagment.entity.User;

public interface UserService {

	UserDto createUser(UserDto userDto);
	UserDto getUserById(String id);
	List<User> getAllUsers();

}
