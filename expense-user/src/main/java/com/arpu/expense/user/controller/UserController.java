package com.arpu.expense.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arpu.expense.user.jpa.User;
import com.arpu.expense.user.model.UserDTO;
import com.arpu.expense.user.service.IUserService;
import com.arpu.expense.user.service.impl.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	
	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDTO> getUser() {
		List<UserDTO> userList = userService.getUsers();  
		return null;
	}

}
