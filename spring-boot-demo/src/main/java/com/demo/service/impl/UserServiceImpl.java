package com.demo.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserMapper;
import com.demo.domain.po.User;
import com.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public User selectUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		/*user.setUserId(2);
		user.setPassWard("ujjn");*/
		userMapper.updateUser(user);
		/*User userNew = new User();
		userNew.setUserId(2);
		User i = userMapper.selectUser(userNew);
		LOGGER.info(i.getPassWard());
		if (true) {
	        throw new RuntimeException("update 抛异常了");
	    }*/
		
	}

}
