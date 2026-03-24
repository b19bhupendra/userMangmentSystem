package com.bhupendra.userManagment.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhupendra.userManagment.dto.UserDto;
import com.bhupendra.userManagment.entity.User;
import com.bhupendra.userManagment.repository.UserRepository;
import com.bhupendra.userManagment.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}
	
	@Override
	public UserDto createUser(UserDto userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setCreatedAt(LocalDateTime.now());
		
		User savedUser = userRepository.save(user);
		return new UserDto(savedUser.getId(),
							savedUser.getName(),
							savedUser.getEmail()
						  );
		
	}
	
	@Override
	public UserDto getUserById(String id) {
		
		User user = userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("User not found"));
		return new UserDto(
				user.getId(),
				user.getName(),
				user.getEmail()
			);
	}
	
   @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
