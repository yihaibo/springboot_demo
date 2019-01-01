package com.demo.service;

import com.demo.domain.po.User;

/**
 * @ClassName: IUserService  
 * @Description：用户Service接口  
 * @author yhb
 *
 */
public interface IUserService {

	void insertUser(User user);
	
	User selectUser(User user);
	
	void updateUser(User user);
}
