package com.demo.dao;

import com.demo.domain.po.User;

/**
 * @ClassName: UserMapper  
 * @Description:用户Mapper
 * @author yhb
 */
public interface UserMapper {

	void insertUser(User user);
	
	User selectUser(User user);
	
	void updateUser(User user);
}
