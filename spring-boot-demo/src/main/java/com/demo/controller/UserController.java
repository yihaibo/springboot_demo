package com.demo.controller;

import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.demo.domain.po.User;
import com.demo.service.IUserService;
import com.demo.util.ResponseInfo;

/**
 * 
 * @ClassName: UserController  
 * @Description:用户Controller  
 * @author yhb
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;
	
	/**
	 * 
	 * @Title: insertUser
	 * @Description:增加用户
	 * @author yhb
	 * @param user 
	 * @return ResponseInfo<String>
	 */
	@ApiOperation(value = "添加用户信息", notes = "添加用户信息")
    @PostMapping(value = "/insert")
	public ResponseInfo<String> insertUser(User user) {
		LOGGER.debug("begin service insert user:" +  JSONObject.toJSONString(user));
		ResponseInfo<String> response = new ResponseInfo<String>();
        try {
        	userService.insertUser(user);
        	String message = "添加用户成功";
        	response.setBody(message);
        } catch (Exception e) {
        	response.setSuccess(false);
			response.setMessage("添加用户异常");
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error(String.format("添加用户异常:%s", e));
			}
        }
        return response;
	}
	
	/**
	 * 
	 * @Title: updateUser
	 * @Description:修改用户
	 * @author yhb
	 * @param user 
	 * @return ResponseInfo<String>
	 */
	@ApiOperation(value = "修改用户信息", notes = "修改用户信息")
    @PostMapping(value = "/update")
	public ResponseInfo<String> updateUser(User user) {
		LOGGER.debug("begin service update user:" +  JSONObject.toJSONString(user));
		ResponseInfo<String> response = new ResponseInfo<String>();
        try {
        	userService.updateUser(user);
        	String message = "修改用户成功";
        	response.setBody(message);
        } catch (Exception e) {
        	response.setSuccess(false);
			response.setMessage("修改用户异常");
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error(String.format("修改用户异常:%s", e));
			}
        }
        return response;
	}
}
