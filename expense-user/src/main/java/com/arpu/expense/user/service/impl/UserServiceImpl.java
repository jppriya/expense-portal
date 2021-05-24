/**
 * 
 */
package com.arpu.expense.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arpu.expense.user.dao.IUserDao;
import com.arpu.expense.user.jpa.User;
import com.arpu.expense.user.model.UserDTO;
import com.arpu.expense.user.service.IUserService;

/**
 * @author admin
 *
 */
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserDao userDao;
	
	@Override
	public List<UserDTO> getUsers() {
		
		return userDao.getUsers();
	}

}
