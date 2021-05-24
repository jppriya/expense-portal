/**
 * 
 */
package com.arpu.expense.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.arpu.expense.user.jpa.User;

/**
 * @author admin
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
