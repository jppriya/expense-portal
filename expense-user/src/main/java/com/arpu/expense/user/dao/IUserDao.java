package com.arpu.expense.user.dao;

import java.util.List;

import com.arpu.expense.user.jpa.User;
import com.arpu.expense.user.model.UserDTO;

public interface IUserDao {

	List<UserDTO> getUsers();
}
