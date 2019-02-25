package com.isg.Project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isg.Project.entities.User;
import com.isg.Project.services.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService service;
	
    @RequestMapping(value="/users", method=RequestMethod.POST)
	public void addUser(User user) {
		service.addUser(user);
	}
    
    @RequestMapping(value="/users", method=RequestMethod.PUT)
	public void updateUser(User user) {
		service.updateUser(user);
	}
    
    @RequestMapping(value="/users", method=RequestMethod.DELETE)
	public void deleteUser(User user) {
		service.deleteUser(user);
	}
    
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public Page<User> getAllUsers() {
		return service.getAllUsers(0);
	}
}
