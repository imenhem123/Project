package com.isg.Project.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.isg.Project.dao.UserRepository;
import com.isg.Project.dto.UserDTO;
import com.isg.Project.entities.User;

@Service
public class UserServiceImplement implements UserService {

	@Autowired
	private UserRepository repository;
	
	public void addUser(User user) {
		repository.save(user);
	}
	public void updateUser(User user) {
		repository.save(user);
	}
	public void deleteUser(User user) {
		repository.delete(user);
	}
	public Page<User> getAllUsers(@RequestParam(defaultValue="0")int page) {
		return repository.findAll(new PageRequest(page, 4));
	}
	public UserDTO convertToDto(User user) {
		ModelMapper mapper = new ModelMapper();
		UserDTO dto = new UserDTO();
		mapper.map(user,dto);
	    return dto;
	}
	public User convertToEntity(UserDTO dto) {
		ModelMapper mapper = new ModelMapper();
		User user = new User();
		mapper.map(dto,user);
	    return user;
	}
}
