/**
 * 
 */
package com.arpu.expense.user.service;

import java.util.List;

import com.arpu.expense.user.jpa.User;
import com.arpu.expense.user.model.UserDTO;

/**
 * @author admin
 *
 */
public interface IUserService {
	
	List<UserDTO> getUsers();
}
