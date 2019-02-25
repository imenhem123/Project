package com.isg.Project.services;

import org.springframework.data.domain.Page;

import com.isg.Project.dto.UserDTO;
import com.isg.Project.entities.User;

public interface UserService {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public Page<User> getAllUsers(int page);
	public UserDTO convertToDto(User user);
	public User convertToEntity(UserDTO dto);
}
